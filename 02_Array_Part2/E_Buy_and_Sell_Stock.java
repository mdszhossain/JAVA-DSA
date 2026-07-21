public class E_Buy_and_Sell_Stock {
    public static int maximumProfit(int[] prices) {
        // initial buying price set.
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // traverse each selling price and calculate profit
        for(int i = 0; i < prices.length; i++) {
            int sellingPrice = prices[i];
            // comparison & profit calculation
            if(buyingPrice < sellingPrice) {
                int profit = sellingPrice - buyingPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyingPrice = sellingPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = maximumProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}