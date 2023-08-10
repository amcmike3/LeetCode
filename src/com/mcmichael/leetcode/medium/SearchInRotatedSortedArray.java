package com.mcmichael.leetcode.medium;
class SearchInRotatedSortedArray
 {
//	brute force;
    public int search(int[] nums, int target) {
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] == target) {
    			return i;
    		}
    	}
        
    	return -1;
    }
}