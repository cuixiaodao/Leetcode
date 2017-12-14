package array;

/**
 * Created by cuixiaodao on 10/15/017
 * for leetCode problem:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */

public class BestTimeBuyStock {
    public int maxProfit(int[] prices) {
        int maxProf = 0, start = 0;
        int[] findRes;
        do {
            findRes = findMaxProfit(prices, start);
            maxProf = Math.max(findRes[0], maxProf);
            start = findRes[1];
        } while (start < prices.length);

        return maxProf;
    }

    /**
     * find next profit
     *
     * @param prices, price of each day
     * @param start,  start index
     * @return [nex maxium profit, search end]
     */
    private int[] findMaxProfit(int[] prices, int start) {
        int i = start;
        while (i + 1 < prices.length && prices[i] >= prices[i + 1]) i++;
        if (i + 1 == prices.length) return new int[]{0, prices.length};

        int curProfit = 0, maxProfit = 0;
        while (curProfit >= 0 && ++i < prices.length) {
            curProfit += prices[i] - prices[i - 1];
            maxProfit = Math.max(curProfit, maxProfit);
        }

        return new int[]{maxProfit, i};
    }
}