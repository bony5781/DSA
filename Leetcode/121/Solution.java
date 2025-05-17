class Solution {
    public int maxProfit(int[] prices) {
        int buyDay = 0, sellDay = 1;
        int maxProfit = 0;

        while (sellDay < prices.length) {
            if (prices[sellDay] > prices[buyDay]) {
                int profit = prices[sellDay] - prices[buyDay];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyDay = sellDay;
            }
            sellDay++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
