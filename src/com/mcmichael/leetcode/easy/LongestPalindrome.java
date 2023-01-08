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
			//in the ascii table chracters are not contiguous 
			//between the capital and lowercase there are 6 other characters
			// we have this if conditional to handle those extra 6 non letter characters
			if (Character.isUpperCase(ch)) {
				charTable[ch - 'A'] += 1;
			} else {
				charTable[ch - ('A' + 6)] += 1;
			}
		}
		
		//increment palindrome length for all multiples of 2
		for (int i : charTable) {
			if (i % 2 > 0) {
				oddNum = true;
			}
			palidromeLength += i / 2;
			
		}
		//double the number if pairs found to account for individuals
		palidromeLength *= 2;
		
		
		//if there was an odd number in the table we can place 1 in the center of the palindrome
		if(oddNum) {
			palidromeLength += 1;
		}
		
		return palidromeLength;
	}
	/*
	 * in order for something to be a palindrome we know it must have two of everything except for the center
	 * so we create a table for all 56 characters and store the number of occurance for any character
	 * then we iterate over the table and store all multiples of two
	 * and mark if there was any odd number if there was an odd number 
	 * we increment the total palindrome length by 1
	 */
}
