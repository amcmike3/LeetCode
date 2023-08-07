package com.mcmichael.leetcode.easy;

import java.util.Arrays;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int[] temp = Arrays.copyOfRange(nums1, 0, m);
    	for (int i = nums1.length - 1; i >= 0; i--) {
    		if (m == 0) {
    			nums1[i] = nums2[n-1];
    			n--;
    		} else if (n == 0 || temp[m-1] > nums2[n-1]) {
    			nums1[i] = temp[m-1];
    			m--;
    		} else {
    			nums1[i] = nums2[n-1];
    			n--;
    		}
    	}
        
    }
}