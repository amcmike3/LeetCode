package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;

class MoveZeroes {
    public void moveZeroes(int[] nums) {
    	ArrayList<Integer> zeroes = new ArrayList<>();
     
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0) {
    			zeroes.add(i);
    		}
    		else if (!zeroes.isEmpty()) {
    			nums[zeroes.get(0)] = nums[i];
    			nums[i] = 0;
				zeroes.add(i);
				Collections.sort(zeroes);
    		}
    	}
    }
}