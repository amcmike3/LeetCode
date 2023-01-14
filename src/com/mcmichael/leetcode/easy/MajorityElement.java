package com.mcmichael.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MajorityElement {

	public int majorityElement(int[] nums) {

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
}
