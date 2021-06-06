package lintcode.q1538;

public class Solution {
    /**
     * @param cost:        costs of all cards
     * @param damage:      damage of all cards
     * @param totalMoney:  total of money
     * @param totalDamage: the damage you need to inflict
     * @return: Determine if you can win the game
     */
    public boolean cardGame(int[] cost, int[] damage, int totalMoney, int totalDamage) {
        // Write your code here
        int[][] maxDamage = new int[cost.length][totalMoney + 1];
        for (int moneyCost = 0; moneyCost <= totalMoney; moneyCost++) {
            maxDamage[0][moneyCost] = moneyCost >= cost[0] ? damage[0] : 0;
        }
        for (int cardIdx = 1; cardIdx < cost.length; cardIdx++) {
            for(int moneyCost=0;moneyCost<=totalMoney;moneyCost++){
                if(moneyCost<cost[cardIdx]){
                    // 只能用更小的
                    maxDamage[cardIdx][moneyCost]=maxDamage[cardIdx-1][moneyCost];
                }else{
                    maxDamage[cardIdx][moneyCost]=Math.max(
                            maxDamage[cardIdx-1][moneyCost],
                            maxDamage[cardIdx-1][moneyCost-cost[cardIdx]]+damage[cardIdx]
                    );
                }
            }
        }
        return maxDamage[damage.length-1][totalMoney]>=totalDamage;
    }
}