package com.mcmichael.leetcode.easy;

public class PalindromeNumber {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean isPalindrome(int x) {  
	     
		  boolean ans = false;
				     int reverse = 0;
				     int tempX = x;
				     
				     while (tempX >= 1) {
				    	 reverse = (reverse * 10) + (tempX % 10);
		                 tempX = tempX / 10;
				     }
				     if (reverse == x) {
				    	 ans = true;
				     }
			         return ans;
		    }
}
