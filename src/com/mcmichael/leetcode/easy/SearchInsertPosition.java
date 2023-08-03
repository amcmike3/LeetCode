package com.mcmichael.leetcode.easy;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		
//        int start = 0;
//        int end = nums.length - 1;
//        int mid = end / 2;
//        while (start < end) {
//        	if (target > nums[mid]) {
//        		start = mid + 1;
//        		mid += (start - end) / 2; 
//        	} else if (target < nums[mid]){
//        		end = mid - 1;
//        		mid = (end / 2) + start;
//        	} else {
//        		break;
//        	}
//        }
//		
//		return mid;
		
//		int start = 0;
//		int end = nums.length - 1;
//		int mid = nums.length / 2;
//		while (start < end) {
//			if (target < nums[mid]) {
//				mid /= 2;
//				end = nums[mid];
//			} else if (target > nums[mid]) {
//				mid += (mid / 2);
//				start = nums[mid];
//			} else {
//				if (nums[mid] > target) {
//					ans = mid;
//				} else if (nums[mid] < target) {
//					ans = mid + 1;
//				}
//				break;
//			}
//		}
//		
//
//		return mid;

//		int start = 0;
//		int end = nums.length - 1;
//		int mid = end / 2;
//		int ans = 0;
//		while (start < end) {
//			if (target > nums[mid]) {
//				start = mid;
//				mid += mid/2;
//			} else if (target < nums[mid]) {
//				end = mid;
//				mid = mid/2;
//			} else {
//				if (nums[mid] > target) {
//					ans = mid;
//				} else if (nums[mid] < target) {
//					ans = mid + 1;
//				}
//				break;
//			}
//		}
//		return ans;
		
		int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
					int mid = start + (end - start) / 2;
					if (nums[mid] == target){
						return mid;
					} else if (	nums[mid] > target){
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				}
				return start;
	
	}
}
