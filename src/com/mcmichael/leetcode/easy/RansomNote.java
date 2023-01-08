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
	      
		  char[] ransArr = ransomNote.toCharArray();
		  char[] magArr = magazine.toCharArray();
		  Arrays.sort(ransArr);
		  Arrays.sort(magArr);
		  int ransIndex = 0;
		  for (int i = 0; i < magazine.length(); i++) {
			  if(ransIndex == ransomNote.length()) {
				  break;
			  }
			  if (ransArr[ransIndex] == magArr[i] ) {
				  ransIndex++;
			  }
		  }
		  if (ransIndex >= ransomNote.length()) {
			  
			  return true;
		  }
		  return false;
	    }
}
