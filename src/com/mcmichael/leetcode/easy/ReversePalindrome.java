package com.mcmichael.leetcode.easy;

public class ReversePalindrome {

	/*
	 * Given an integer x, return true if x is a palindrome , and false otherwise.
	 */
	public static boolean isIntegerPalindrome(int x) {
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
	 * this just tests if you can reverse a number. explained: move the decimal to
	 * the right and take the digit in the tenth position then add it to the
	 * reverse. continue to do this until there is no longer a number in the tenth
	 * position.
	 */

	// ----------------------------------------------------------------------------------------

	/*
	 * A phrase is a palindrome if, after converting all uppercase letters into
	 * lowercase letters and removing all non-alphanumeric characters, it reads the
	 * same forward and backward. Alphanumeric characters include letters and
	 * numbers.
	 * 
	 * Given a string s, return true if it is a palindrome, or false otherwise.
	 */

	public boolean isStringPalindrome(String s) {
		s = s.toLowerCase();
		char[] chars = s.toCharArray();
		int start = 0;
		int end = chars.length - 1;

		while (start < end) {
			if (Character.isLetterOrDigit(chars[start]) && Character.isLetterOrDigit(chars[end])) {
				if (chars[start] != chars[end]) {
					return false;
				}
				start++;
				end--;
			} else if (!Character.isLetterOrDigit(chars[start])) {
				start++;
			} else if (!Character.isLetterOrDigit(chars[end])) {
				end--;
			}
		}

		return true;
	}
	/*
	 * first change all characters to lower case so comparisons are case insensitive
	 * the step of creating a char[] could be omitted and the s.indexOf() method could have been used
	 * but for the sake of readability a char[] is used.
	 * iterate comparing each side of string if they are both characters otherwise move the respective side until it is a valid character.
	 * 
	 *  if at any point both sides are letters but not equal exit and return false.
	 * 
	 */
}
