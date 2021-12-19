package com.shuati;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        // DP problem, see maxSubArray.
        // we always try find a low buy point, then sell high and record 
        // this max. If we find another even low buy point, we change 
        // the buy day to this day, then try to sell high again. But,
        // we will compare this new max with older one, and select the 
        // bigger one.
        // loop the prices, at any index, we have a older max, which 
        // starts as Integer.MIN_VALUE. We move the maxIndex if we find
        // lower price. Also record max if we found sell is maxed.
        // [7,1,5,3,6,4]  
        int maxIndex = 0;
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < prices.length; i ++) {
            int tmp = prices[i] - prices[maxIndex];
            if (tmp < 0) {
                maxIndex = i;
            }
            else {
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;
    }

    public int maxProfitSlow(int[] prices) {
        // for any give day, we jave maxProfit d[n]
        // for next day, we have
        // d[n+1] = max(d[n], x - p[n+1])
        // [7,1,5,3,6,4]  
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < prices.length; i ++) {
            for (int j = i; j < prices.length; j ++) {
                int tmp = prices[j] - prices[i];
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        if (max < 0) {
            max = 0;
        }
        return max;
    }
}
