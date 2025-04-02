/* You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7. */

public class maxProfit {
    public static void main(String[] args) {
        // Example inputs
        int[] prices1 = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = { 1, 2, 3, 4, 5 };

        // Get the maximum profit
        System.out.println("Maximum Profit for prices1: " + maxProfits(prices1)); // Expected: 7
        System.out.println("Maximum Profit for prices2: " + maxProfits(prices2)); // Expected: 4
    }

    public static int maxProfits(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // If the price on the current day is higher than the previous day, we can make
            // a profit

            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1]; // Add the difference to the profit
            }
        }

        return totalProfit;
    }
}
