package com.pawesomebytes.leetcode.java;

public class N121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        if (prices.length == 2) {
            return Math.max(0, prices[1] - prices[0]);
        }

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy) {
                profit = Math.max(profit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }

        return profit;
    }
}
