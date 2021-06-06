package lintcode.q798;

public class Solution {
    /**
     * @param n:       the money of you
     * @param prices:  the price of rice[i]
     * @param weight:  the weight of rice[i]
     * @param amounts: the amount of rice[i]
     * @return: the maximum weight
     */
    public int backPackVII(int n, int[] prices, int[] weight, int[] amounts) {
        // write your code here
        int[][] maxWeight = new int[weight.length][n + 1];
        for (int money = 0; money <= n; money++) {
            maxWeight[0][money] = weight[0] * Math.min(money / prices[0], amounts[0]);
        }
        for (int riceId = 1; riceId < weight.length; riceId++) {
            for (int money = 0; money <= n; money++) {
                maxWeight[riceId][money] = 0;
                for (int count = 0; count <= amounts[riceId] && money >= count * prices[riceId]; count++) {
                    maxWeight[riceId][money] = Math.max(
                            maxWeight[riceId][money],
                            maxWeight[riceId - 1][money - prices[riceId] * count] + weight[riceId] * count
                    );
                }
            }
        }
        return maxWeight[prices.length - 1][n];
    }
}