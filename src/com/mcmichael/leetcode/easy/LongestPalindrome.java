package com.mcmichael.leetcode.easy;

public class LongestPalindrome {

	/*
	 * Given a string s which consists of lowercase or uppercase letters, return the
	 * length of the longest palindrome that can be built with those letters.
	 * 
	 * Letters are case sensitive, for example, "Aa" is not considered a palindrome
	 * here.
	 */

	public int longestPalindrome(String s) {

		int[] charTable = new int[52];
		int palidromeLength = 0;
		boolean oddNum = false;
		
		for (char ch : s.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				charTable[ch - 'A'] += 1;
			} else {
				charTable[ch - ('A' + 6)] += 1;
			}
		}
		
		for (int i : charTable) {
			if (i % 2 > 0) {
				oddNum = true;
			}
			palidromeLength += i / 2;
			
		}
		palidromeLength *= 2;
		
		if(oddNum) {
			palidromeLength += 1;
		}
		
		return palidromeLength;
	}
}
