package com.mcmichael.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		System.out.println("This is a space to write solutions before they are complete");
	}

	public boolean isValid(String s) {
		
		
		List<Character> opener = Arrays.asList('(', '{', '[');
		List<Character> closer = Arrays.asList(')','}',']');
		List<Character> stack = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			
			if(opener.contains(s.charAt(i))) {
				stack.add(s.charAt(i));
			}
			else if (closer.contains(s.charAt(i))) {
				if(s.charAt(i) == ')' && stack.get(stack.size()-1) == '(') {
					stack.remove(stack.size() - 1);
				} else if(s.charAt(i) == '}' && stack.get(stack.size()-1) == '{') {
					stack.remove(stack.size() - 1);
				} else if(s.charAt(i) == ']' && stack.get(stack.size()-1) == '[') {
					stack.remove(stack.size() - 1);
				} else {
					return false;
				}
				
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
    }
	   	
}
