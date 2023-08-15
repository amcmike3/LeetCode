package com.mcmichael.leetcode.medium;



class Search2DMatrix
 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	boolean ans = false;
    	
    	for (int[] arr : matrix) {
    		if (arr[0] <= target && arr[arr.length - 1] >= target) {
    			for (int num : arr) {
    				if (num == target) {
    					ans = true;
        				break;
    				}	
    			}
    		}
    		if (ans) {
    			break;
    		}
    	}
    	
    	return ans;
    }
    
//    	does not work for select use cases. attempts to use binary search
//    public boolean searchMatrix2(int[][] matrix, int target) {
//    	boolean ans = false;
//    	
//    	for (int[] arr : matrix) {
//    		if (arr[0] <= target && arr[arr.length - 1] >= target) {
//    			int start = 0;
//    			int end = arr.length -1;
//    			
//    			while (start <= end) {
//    				int mid = start + ((end - start) / 2);
//    				
//    				if (arr[mid] == target) {
//    					ans = true;
//    					break;
//    				} else if (arr[mid] > target){
//    					start = mid + 1;
//    				} else {
//    					end = mid - 1;
//    				}
//    			}
//    		}
//    		if(ans) {
//    			break;
//    		}
//    	}
//    	
//    	return ans;
//    }
}