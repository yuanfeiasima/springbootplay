package com.wwt.springbootplay.algorithms;

/**
 * 买卖股票最佳时机1
 * 只允许完成一次交易
 * @author grace
 * @date 2019-07-19 15:26
 */
public class L121StockMaxValue {
    /**
     * 状态转移方程
     * dp[i][k][0] = max(dp[i-1][k][0], dp[i-1][k][1] + prices[i])
     *               max(   选择 rest  ,           选择 sell      )
     *
     * 解释：今天我没有持有股票，有两种可能：
     * 要么是我昨天就没有持有，然后今天选择 rest，所以我今天还是没有持有；
     * 要么是我昨天持有股票，但是今天我 sell 了，所以我今天没有持有股票了。
     *
     * dp[i][k][1] = max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i])
     *               max(   选择 rest  ,           选择 buy         )
     *
     * 解释：今天我持有着股票，有两种可能：
     * 要么我昨天就持有着股票，然后今天选择 rest，所以我今天还持有着股票；
     * 要么我昨天本没有持有，但今天我选择 buy，所以今天我就持有股票了。
     *
     * 这个解释应该很清楚了，如果 buy，就要从利润中减去 prices[i]，如果 sell，就要给利润增加 prices[i]。
     * 今天的最大利润就是这两种可能选择中较大的那个。而且注意 k 的限制，我们在选择 buy 的时候，把 k 减小了 1，
     * 很好理解吧，当然你也可以在 sell 的时候减 1，一样的。
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int n = prices.length;
        //没有持有股票的状态
        int dp_i_0 = 0,
        //持有股票的状态
        dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            //       选择    昨天没有持有今天选择rest；  昨天没有持有，今天选择卖出
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            //       选择    昨天持有今天选择rest； 昨天持有，今天选择买入
            dp_i_1 = Math.max(dp_i_1, -prices[i]);
        }
        return dp_i_0;
    }
}
