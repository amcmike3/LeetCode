package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ValidAnagram {

	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise.
	 * 
	 * An Anagram is a word or phrase formed by rearranging the letters of a
	 * different word or phrase, typically using all the original letters exactly
	 * once.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "anagram", t = "nagaram" Output: true Example 2:
	 * 
	 * Input: s = "rat", t = "car" Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length, t.length <= 5 * 104 s and t consist of lowercase English
	 * letters.
	 * 
	 * 
	 * Follow up: What if the inputs contain Unicode characters? How would you adapt
	 * your solution to such a case?
	 */

	public boolean isAnagramCollections(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		ArrayList<Character> listS = new ArrayList<>();
		ArrayList<Character> listT = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			listS.add(s.charAt(i));
			listT.add(t.charAt(i));
		}
		Collections.sort(listS);
		Collections.sort(listT);

		for (int i = 0; i < listS.size(); i++) {
			if (listS.get(i) != listT.get(i)) {
				return false;
			}
		}

		return true;

	}

	public boolean isAnagramArrays(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		Arrays.sort(tArr);
		Arrays.sort(sArr);
		return Arrays.equals(tArr, sArr);

	}
}
