// Title: Best Time to Buy and Sell Stock
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

        }
        for(int i=0;i<prices.length;i++){
        int profit=0;
            buy=Math.min(buy,prices[i]);
            profit=Math.max(profit,prices[i]-buy);
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
