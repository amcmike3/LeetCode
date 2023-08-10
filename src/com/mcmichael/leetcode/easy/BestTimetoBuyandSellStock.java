package com.mcmichael.leetcode.easy;

public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int ans = 0;
        int minSoFar = Integer.MAX_VALUE;
    	
        for (int i = 0; i< prices.length; i++) {
        	if (prices[i] < minSoFar) {
        		minSoFar = prices[i];
        	}
        	
        	if (prices[i] - minSoFar > ans) {
        		ans = prices[i] - minSoFar;
        	}
        	
        }
        
    	return ans;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day.
	 * 
	 * You want to maximize your profit by choosing a single day to buy one stock
	 * and choosing a different day in the future to sell that stock.
	 * 
	 * Return the maximum profit you can achieve from this transaction. If you
	 * cannot achieve any profit, return 0.
	 */
	public int maxProfit2(int[] prices) {
		int profit = 0;
		int minSoFar = prices[0];

		for (int i = 0; i < prices.length; i++) {
			if (minSoFar > prices[i]) {
				minSoFar = prices[i];
			}
			if (prices[i] - minSoFar > profit) {
				profit = prices[i] - minSoFar;
			}
		}

		return profit;
	}
	/*
	 * iterate over array always maintain the minimum. 
	 * check the difference of min and current number then store only the largest value
	 */
}
