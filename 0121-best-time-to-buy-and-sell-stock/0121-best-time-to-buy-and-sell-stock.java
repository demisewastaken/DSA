class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        int bestBuy = prices[0];
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - bestBuy);
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return max;
    }
}