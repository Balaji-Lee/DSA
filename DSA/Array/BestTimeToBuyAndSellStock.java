public class BestTimeToBuyAndSellStock {

    // LEETCODE 
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {

        int[] prices = new int[] { 7, 1, 5, 3, 10, 4 };
        int profit = maxProfit(prices);
        System.out.print("Profit :" + profit);

    }

    public static int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(profit<prices[j]-prices[i]){
                    profit=prices[j]-prices[i];
                }
            }
        }
        return profit;
    }
}