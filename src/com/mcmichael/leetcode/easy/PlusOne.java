package com.mcmichael.leetcode.easy;

import java.util.Arrays;

public class PlusOne {

	public int[] plusOne(int[] digits) {
		int temp = 1;
        
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] += temp;
			if (digits[i] % 10 > 0) {
				temp = digits[i] / 10;
				digits[i] = digits[i] % 10;
				if (i == 0) {
					int [] tempArr = new int[digits.length + 1];
					tempArr[0] = temp;
					int index = 0;
					for (int num : digits){
						index++;
						tempArr[index] = num;
					}
					digits = tempArr;
					
				}
			} else {
				break;
			}
		}
		return digits;
    }
}
