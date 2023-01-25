package com.mcmichael.leetcode.medium;

public class MaximumSubarray {
	
	//brute force 0(n^2)
	 public int maxSubArrayBruteForce(int[] nums) {
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
	 
	 //optimal Kadanes algorithm
	 public int maxSubArray(int[] nums) {
	        //Kadanes Algorithm
	        //Maximum subarray
	        
	        int msf=nums[0],mth=nums[0];
	        
	        for(int i=1;i<nums.length;i++){
	            if(mth<0)
	                mth=0;
	            mth+=nums[i];
	            msf=Math.max(msf,mth);
	        }
	        
	        return msf;
	    }

}
