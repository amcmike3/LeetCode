package com.mcmichael.leetcode.easy;

public class BinarySearch {

	public int search(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (target < nums[mid]) {
				right = mid - 1;
			} else if (target > nums[mid]) {
				left = mid + 1;
			} else {
				return mid;
			}
			
		}
		return -1;
	}

}
