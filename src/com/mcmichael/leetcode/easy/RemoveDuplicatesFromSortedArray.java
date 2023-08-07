package com.mcmichael.leetcode.easy;

import java.util.HashSet;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
    	HashSet<Integer> set = new HashSet<>();
    	int index = 0;
    	for (int i = 0; i < nums.length; i++) {
    		if (set.add(nums[i])) {
    			nums[index] = nums[i];
    			index++;
    		}
    	}
    
    	return index;
    }
    public int removeDuplicates2(int[] nums) {
        int insertIndex = 1;
        for (int i=1; i < nums.length; i++){
            if (nums[i-1] != nums[i]){
                nums[insertIndex] = nums[i];
                insertIndex++;
            } 
        }
       return insertIndex;
    }
}