package com.mcmichael.leetcode.medium;

public class Matrix01 {
	public int[][] updateMatrix(int[][] mat) {
		if (mat.length == 1 && mat[0].length == 1) {
			return mat;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j == 0) {
//					 nothing left
					
				}
				if (j == mat[i].length - 1) {
//					nothing right
				}
				if (i == 0) {
//					nothing above
				}
				if (i == mat.length - 1) {
//					nothing below
				}
				
				
			}
		}
		
		return null;
	}

}
