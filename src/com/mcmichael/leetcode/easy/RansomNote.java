package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RansomNote {
	/*
	 * Given two strings ransomNote and magazine, return true if ransomNote can be
	 * constructed by using the letters from magazine and false otherwise.
	 * 
	 * Each letter in magazine can only be used once in ransomNote.
	 */
	
	  public boolean canConstruct(String ransomNote, String magazine) {
	      if (magazine.length() < ransomNote.length()) return false;
	      
		  char[] ransArr = ransomNote.toCharArray();
		  char[] magArr = magazine.toCharArray();
		  Arrays.sort(ransArr);
		  Arrays.sort(magArr);
		  int ransIndex = 0;
		  for (int i = 0; i < magazine.length(); i++) {
			  if (ransArr[ransIndex] == magArr[i] ) {
				  ransIndex++;
			  }
			  if(ransIndex == ransomNote.length()) {
				  return true;
			  }
		  }
		 
		  return false;
	    }
	  /*
	   * Sort both lists so we don't have to iterate over magazine characters more than once
	   * each time a character from magazine matches move to the next letter in ransomNote String
	   * do this until all letters are accounted for in ransomNote.
	   * if all letters are already accounted for break early and return true
	   */
}
