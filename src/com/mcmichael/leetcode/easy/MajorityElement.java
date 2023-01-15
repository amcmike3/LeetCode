package com.mcmichael.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MajorityElement {
	/*
	 * Given an array nums of size n, return the majority element.
	 * 
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
	 * may assume that the majority element always exists in the array.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,2,3] Output: 3 Example 2:
	 * 
	 * Input: nums = [2,2,1,1,1,2,2] Output: 2
	 * 
	 */

	public int majorityElement(int[] nums) {
		/*
		 * iterate over given array and return the element that occurs most often.
		 */
		HashMap<Integer, Integer> map = new HashMap<>();

		int maj = nums[0];
		int biggest = 0;
		for (int i : nums) {
			if (map.get(i) == null) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
			if (map.get(i) > biggest) {
				maj = i;
				biggest = map.get(i);
			}
		}

		return maj;
	}

	public int majorityElement2(int[] nums) {
		/*
		 * the majority element will always occupy the center. this assumes there is
		 * actually an element that has a majority
		 */
		Arrays.sort(nums);
		return nums[nums.length / 2];

	}
}
