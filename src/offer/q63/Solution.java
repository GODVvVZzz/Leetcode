package offer.q63;

import java.util.Map;

/**
 * @author HP
 * @date 2022/3/17
 */
public class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE, profit = 0;
        for(int price : prices){
            min = Math.min(min, price);
            profit = Math.max(profit, price-min);
        }

        return profit;
    }
}
