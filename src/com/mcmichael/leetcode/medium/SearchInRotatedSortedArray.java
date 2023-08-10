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
    public int search2(int[] nums, int target) {
    	int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            
            double num = (nums[mid] < nums[0]) == (target < nums[0])
                       ? nums[mid]
                       : target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                       
            if (num < target)
                lo = mid + 1;
            else if (num > target)
                hi = mid;
            else
                return mid;
        }
        return -1;
    }
}