package com.mcmichael.leetcode.easy;

import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class ValidParenthesis {
 
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        boolean ans = false;
	        String sa = "";
	        for (Character c : s.toCharArray()){
	            if (c == '('){
	                stack.add(c);
	            } else if (c == '{'){
	                stack.add(c);
	            } else if (c == '['){
	                stack.add(c);
	            }
	            /*
	             * 
	            The purpose of the first if conditional below is to cover cases when there is no open parenthesis, 
	      	    the stack will be empty and a false positive will be given near line 66.
	      	    we have a placeholder to have final check against if there is a closing parenthesis when there was no open parenthesis.
	             */

	            if (stack.isEmpty() || (c == ')' && stack.peek() != '(') || (c == '}' && 
	                    stack.peek() != '{') || (c == ']' && stack.peek() != '[')){
	                sa += c;
	            } else if (c == ')' && stack.peek() == '('){
	                stack.pop();
	            } else if (c == ']' && stack.peek() == '['){
	                stack.pop();
	            } else if (c == '}' && stack.peek() == '{'){
	                stack.pop();
	            }
	        }
	        if (stack.isEmpty() && !(sa.contains(")") || sa.contains("]") || sa.contains("}"))){
	            ans = true;
	        }
	        return ans;
	    }
	 /*
	  * my solution basically iterates over the given string and for any opening parenthesis we will add it to the top of the stack.
	  * Stack data structure works perfect for this problem because order matters. 
	  * we only care about the most recent open parenthesis type if the incoming closing parenthesis does not match the one on
	  * the top of the stack it is not a valid parenthesis.
	  * 
	  */
}
