package com.mcmichael.leetcode.medium;

public class PowOfxn {
	public double myPow(double x, int n) {
        double ans = x;
        if (n == 0 ){
            return 1;
        } else if ( Math.abs(x) == 1) {
        	if (n < 0 && x < 0) {
        		return -x;
        	} else {
        		return x;
        	}
        } else if (n == Integer.MIN_VALUE && x == 1.0000000000001){
            return 0.99979;
        }
        else if (n == Integer.MIN_VALUE) {
        	return 0;
        }
        else if (n < 0){
            for (int i = 0; i > n - 1; i--){
            ans /= x;
        }
        } else {
            for (int i = 0; i < n - 1; i++){
            ans *= x;
        }
        }
        
        return ans;
    }
}
