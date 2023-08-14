package com.mcmichael.leetcode.medium;

public class PowOfxn {
	public double myPow(double x, int n) {
        double ans = x;
        if (n == 0 || x == 1){
            return 1;
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
