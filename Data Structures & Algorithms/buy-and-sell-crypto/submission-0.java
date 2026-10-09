class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - buy, maxProfit);
            buy = Math.min(buy, prices[i]);
        }
        return maxProfit;
    }
}
