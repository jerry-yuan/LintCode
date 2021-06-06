package lintcode.q125;

import static utils.JSONUtil.print;

public class Solution {
    /**
     * @param packageSize: An integer m denotes the size of a backpack
     * @param A:           Given n items with size A[i]
     * @param V:           Given n items with value V[i]
     * @return: The maximum value
     */
    public int backPackII(int packageSize, int[] A, int[] V) {
        // write your code here
        int[][] maxValue = new int[A.length][packageSize + 1];
        //初始化第一行
        for (int currentSize = 0; currentSize <= packageSize; currentSize++) {
            maxValue[0][currentSize] = (currentSize >= A[0]) ? V[0] : 0;
        }
        //计算后边的
        for (int itemIdx = 1; itemIdx < A.length; itemIdx++) {
            for (int currentSize = 0; currentSize <= packageSize; currentSize++) {
                if (currentSize < A[itemIdx]) {
                    // 当前包裹放itemIdx还放不下
                    maxValue[itemIdx][currentSize] = maxValue[itemIdx - 1][currentSize];
                } else {
                    // 当前包裹能放下itemIdx并且可能还有剩余空间
                    maxValue[itemIdx][currentSize] = Math.max(
                            maxValue[itemIdx - 1][currentSize],                           // itemIdx不放进去
                            maxValue[itemIdx - 1][currentSize - A[itemIdx]] + V[itemIdx]  // itemIdx放进去
                    );
                }
            }
        }
        for (int[] row : maxValue) {
            print(row);
        }
        return maxValue[A.length - 1][packageSize];
    }
}