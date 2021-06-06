package lintcode.q92;

import static utils.JSONUtil.print;

public class Solution {
    /**
     * @param totalSize: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int totalSize, int[] A) {
        // write your code here
        int[][] dp = new int[A.length][totalSize+1];
        for (int j = 0; j < totalSize; j++) {
            dp[0][j] = (j >= A[0]) ? A[0] : 0;
        }
        for (int itemIdx = 1; itemIdx < A.length; itemIdx++) {
            for (int size = 0; size <= totalSize; size++) {
                if (size < A[itemIdx]) {
                    dp[itemIdx][size] = dp[itemIdx - 1][size];
                } else {
                    // 找出不放进去或者放进去中较大的那一个
                    dp[itemIdx][size] = Math.max(
                            dp[itemIdx - 1][size],
                            dp[itemIdx - 1][size - A[itemIdx]] + A[itemIdx]);
                }
            }
        }
        for(int[] a:dp){
            print(a);
        }

        return dp[A.length-1][totalSize];
    }
}