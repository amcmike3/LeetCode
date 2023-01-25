package com.mcmichael.leetcode.medium;

import java.util.ArrayList;
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
		}

		return ans;

	}
}
