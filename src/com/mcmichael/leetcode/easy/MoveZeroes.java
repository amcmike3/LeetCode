package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class MoveZeroes {
	
	public void moveZeroes(int[] nums) {
		int curr = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[curr] = nums[i];
				curr++;
			}
		}
		while(curr < nums.length) {
			nums[curr] = 0;
			curr++;
		}
    }
	
    public void moveZeroes2(int[] nums) {
    	ArrayList<Integer> zeroes = new ArrayList<>();
     
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0) {
    			zeroes.add(i);
    		}
    		else if (!zeroes.isEmpty()) {
    			nums[zeroes.get(0)] = nums[i];
    			nums[i] = 0;
    			zeroes.remove(0);
    			zeroes.add(0, i);
    			Collections.sort(zeroes);
    		}
    	}
    }
    
    public void moveZeroes3(int[] nums) {
    	ArrayList<Integer> zeroes = new ArrayList<>();
     
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == 0) {
    			zeroes.add(i);
    		}
    		else if (!zeroes.isEmpty()) {
    			nums[zeroes.get(0)] = nums[i];
    			nums[i] = 0;
    			zeroes.remove(0);
    			int index = 0;
    			while (index < zeroes.size()  && i > zeroes.get(index)) {
    				index++;
    			}
    			zeroes.add(index, i);
    		}
    	}
    }
}