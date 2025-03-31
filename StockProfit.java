/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
public class StockProfit {

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
        // Initialize the minimum price to the first element of the array
        int minPrice = prices[0];
        int maxProfit = 0;

        // Iterate through the prices array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the potential profit if selling at the current price
            int profit = prices[i] - minPrice;

            // Update the maximum profit if the current profit is greater
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit; // Return the maximum profit
    }
}
