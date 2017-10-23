package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

public class BestTimeBuyStockII{
    public int maxProfit(int[] prices) {
        boolean haveBought = false, isLastDay = false;
        int cost = 0, profit = 0;

        for(int i=0; i<prices.length; i++){
            // when buy
            isLastDay = i+1 == prices.length;
            if(!haveBought && (!isLastDay) && prices[i+1]>=prices[i]){
                haveBought = true;
                cost = prices[i];
            }

            // when sell
            if(haveBought && (isLastDay || prices[i+1]<prices[i])){
                profit += prices[i]-cost;
                haveBought = false; 
                cost = 0;
            }
        }
        return profit;
    }
}