public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        maxProfit(prices);
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0]; // 7 1
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - buyPrice);
            System.out.println(profit);
        }
        return profit;
    }
}
