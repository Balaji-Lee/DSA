package DSA.array;
public class BestTimeToBuyAndSellStock {

    // LEETCODE 
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=array

    public static void main(String[] args) {

        int[] prices = new int[] { 7, 1, 5, 3, 12, 4 };
        int profit = maxProfit(prices);
        System.out.print("Profit :" + profit);
    }

    public static int maxProfit(int[] prices) {
        int minProfit = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int price : prices){
            if(minProfit > price){
                minProfit =price;
            }else{
                int profit =price-minProfit;
                if(maxProfit < profit){
                    maxProfit =profit;
                }
            }
        }
        return maxProfit;
    }
}