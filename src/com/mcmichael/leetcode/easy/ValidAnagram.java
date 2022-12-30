package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ValidAnagram {


	public boolean isAnagramCollections(String s, String t) {

	if (s.length() != t.length()) {
		return false;
	}
	
	ArrayList<Character> listS = new ArrayList<>();
	ArrayList<Character> listT = new ArrayList<>();
	
	for (int i = 0; i <s.length(); i++) {
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
	

}
