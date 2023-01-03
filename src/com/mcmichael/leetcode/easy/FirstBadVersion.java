package com.mcmichael.leetcode.easy;

public class FirstBadVersion {
	public static void main(String[] args) {
		System.out.println(new FirstBadVersion().firstBadVersion(5));
		System.out.println(new FirstBadVersion().firstBadVersionBinarySearch(5));
	}
	 private int firstBadVersionBinarySearch(int i) {
		 int left = 0;
		 int right = i;
		 
		 while (left < right) {
			 int mid = left + (right - left) / 2;
			 if(!isBadVersion(mid)) {
				 left = mid + 1;
			 } else {
				 right = mid;
			 }
		 }
		 
		 return left;
	}
	 
	 
	public int firstBadVersion(int n) {
	     while(!isBadVersion(n)) {
	    	 n--;
	     }
	     return n;
	 }

	 public boolean isBadVersion(int version) {
		 if (version == 4) {
			 return true;
		 }
		 return false;
	 }

}
