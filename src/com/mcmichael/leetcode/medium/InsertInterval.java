package com.mcmichael.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
	/*
	 * You are given an array of non-overlapping intervals intervals where
	 * intervals[i] = [starti, endi] represent the start and the end of the ith
	 * interval and intervals is sorted in ascending order by starti. You are also
	 * given an interval newInterval = [start, end] that represents the start and
	 * end of another interval.
	 * 
	 * Insert newInterval into intervals such that intervals is still sorted in
	 * ascending order by starti and intervals still does not have any overlapping
	 * intervals (merge overlapping intervals if necessary).
	 * 
	 * Return intervals after the insertion.
	 * 
	 * 
	 */

	
	// unfinished still need to figure out how to reduce the size of the ans array to remove nulls;
	public int[][] insert(int[][] intervals, int[] newInterval) {
		if (intervals.length == 0) {
			int [] []ans = {newInterval};
			return ans;
		}

		int[] start = null;
		int[] end = null;
		int[][] ans = new int[intervals.length][];

		for (int[] i : intervals) {
			if (newInterval[0] >= i[0] && newInterval[0] <= i[1]) {
				start = i;
			}
			if (newInterval[1] >= i[0] && newInterval[1] <= i[1]) {
				end = i;
			}

		}
		if (end == null && start != null) {
			start[1] = newInterval[1];
			ans = intervals;
		}
		if (end != null) {
			boolean added = false;
			start[1] = end[1];
			int index = 0;

			for (int i = 0; i < intervals.length; i++) {
				if (intervals[i][0] >= start[0] && intervals[i][1] <= start[1]) {
					// do nothing if any number in an interval is between the interval named start
					if (!added) {
						ans[index] = start;
						index++;
						added = true;
					}
				} else {
					ans[index] = intervals[i];
					index++;

				}

			}
			ans = removeNulls(ans);
		}

		return ans;

	}
	
	public int[][] removeNulls(int[][] arr){
		int [] inner = arr[0];
		int index = 0;
		while (inner != null && index <= arr.length ) {
			inner = arr[index];
			index++;
		}
		int [][] ans = new int[index][];
		for (int i = 0; i < index - 1; i++) {
			ans[i] = arr[i];
		}
		return ans;
				
	}
	
	//leetcode Solutions
	class Solution {
	    // Returns true if the intervals a and b have a common element.
	    boolean doesIntervalsOverlap(int[] a, int[] b) {
	        return Math.min(a[1], b[1]) - Math.max(a[0], b[0]) >= 0;
	    }

	    // Return the interval having all the elements of intervals a and b.
	    int[] mergeIntervals(int[] a, int[] b) {
	        int[] newInterval = {Math.min(a[0], b[0]), Math.max(a[1], b[1])};
	        return newInterval;
	    }

	    int UpperBound(int[][] intervals, int[] newInterval) {
	        if (intervals.length == 0) {
	            // If the list is empty, just insert the newInterval at the 0th position.
	            return 0;
	        }

	        int start = 0, end = intervals.length - 1;
	        int ans = intervals.length;
	        while (start <= end) {
	            int mid = (start + end) / 2;

	            // If the start value is greater than the newInterval
	            // This could be the position, so store it but keep looking on the left side.
	            if (intervals[mid][0] > newInterval[0]) {
	                ans = mid;
	                end = mid - 1;
	            } else {
	                // Search on the right side of mid.
	                start = mid + 1;
	            }
	        }

	        return ans;
	    }

	    // Insert the interval newInterval, into the list interval keeping the sorting order intact.
	    int[][] insertInterval(int[][] intervals, int[] newInterval) {
	        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
	        int index = UpperBound(intervals, newInterval);

	        if (index != intervals.length) {
	            list.add(index, newInterval);
	        } else {
	            list.add(newInterval);
	        }

	        return list.toArray(new int[list.size()][2]);
	    }

	    public int[][] insert(int[][] intervals, int[] newInterval) {
	        // Insert the interval first before merge processing.
	        intervals = insertInterval(intervals, newInterval);

	        List<int[]> answer = new ArrayList<>();
	        for (int i = 0; i < intervals.length; i++) {
	            int[] currInterval = {intervals[i][0], intervals[i][1]};
	            // Merge until the list gets exhausted or no overlap is found.
	            while (i < intervals.length && doesIntervalsOverlap(currInterval, intervals[i])) {
	                currInterval = mergeIntervals(currInterval, intervals[i]);
	                i++;
	            }
	            // Decrement to ensure we don't skip the interval due to outer for-loop incrementing.
	            i--;
	            answer.add(currInterval);
	        }

	        return answer.toArray(new int[answer.size()][2]);
	    }
	}
}
