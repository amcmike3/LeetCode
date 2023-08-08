package com.mcmichael.leetcode.medium;
class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
    	String temp = "";
    	int ans = 0;
    	for (int i = 0; i < s.length(); i++) {
    		char curr = s.charAt(i);
    		if (!(temp.contains(curr + ""))){
    			temp += curr;
    		} else {
    			temp += curr;
    			temp = temp.substring(temp.indexOf(curr) + 1);
    		}
    		if (temp.length() > ans) {
				ans = temp.length();
			}
    		
    	}
    	return ans;
    }
}