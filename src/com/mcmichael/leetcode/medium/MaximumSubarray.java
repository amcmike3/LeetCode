package com.mcmichael.leetcode.medium;

public class MaximumSubarray {
	
	//brute force
	 public int maxSubArray(int[] nums) {
	        int max = nums[0];
	        for (int i =0; i < nums.length; i++){
	            int sum = nums[i];
	            if (sum >= max){
                    max = sum;
                }
	            for (int j = i + 1; j < nums.length; j++){
	                sum += nums[j];
	                if (sum >= max){
	                    max = sum;
	                }
	            }
	        }
	    return max;
	    }

}
