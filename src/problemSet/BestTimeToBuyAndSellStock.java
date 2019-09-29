package problemSet;

/**
 * 题库
 * 121. 买卖股票的最佳时机
 * Easy
 *
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 *
 * https://leetcode-cn.com/submissions/detail/31261589/
 */

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] p = {7,6,4,3,1};
        new BestTimeToBuyAndSellStock(p);
    }

    public BestTimeToBuyAndSellStock(int[] price) {
        System.out.println(maxProfit(price));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            int curr = prices[i];
            for (int j = i+1; j < prices.length; j++) {
                int b = prices[j];
                int r = b - curr;
                if (b > curr && r > result) {
                    result = r;
                }
            }
        }
        return result;
    }
}
