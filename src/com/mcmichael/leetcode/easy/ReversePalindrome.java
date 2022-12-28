package com.mcmichael.leetcode.easy;

public class ReversePalindrome {

	/*
	 * Given an integer x, return true if x is a palindrome , and false otherwise.
	 */
	public static boolean isPalindrome(int x) {
		boolean ans = false;
		int reverse = 0;
		int tempX = x;

		while (tempX >= 1) {
			reverse = (reverse * 10) + (tempX % 10);
			tempX = tempX / 10;
		}
		System.out.println(reverse);
		if (reverse == x) {
			ans = true;
		}
		return ans;
	}
	/*
	 * this just tests if you can reverse a number. 
	 * explained: move the decimal to the right and take the digit in the tenth position then add it to the reverse.
	 * continue to do this until there is no longer a number in the tenth position.
	 */
}
