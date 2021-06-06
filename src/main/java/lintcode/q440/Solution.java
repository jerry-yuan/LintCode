package lintcode.q440;

public class Solution {
    /**
     * @param A: an integer array
     * @param V: an integer array
     * @param m: An integer
     * @return: an array
     */
    public int backPackIII(int[] A, int[] V, int m) {
        // write your code here
        int[][] maxValue = new int[A.length][m + 1];
        for (int currentSize = 0; currentSize <= m; currentSize++) {
            maxValue[0][currentSize] = currentSize / A[0] * V[0];
        }
        for (int itemIdx = 1; itemIdx < A.length; itemIdx++) {
            for (int currentSize = 0; currentSize <= m; currentSize++) {
                maxValue[itemIdx][currentSize] = 0;
                for (int count = 0; count * A[itemIdx] <= currentSize; count++) {
                    maxValue[itemIdx][currentSize] = Math.max(
                            maxValue[itemIdx][currentSize],
                            maxValue[itemIdx - 1][currentSize - A[itemIdx] * count] + V[itemIdx] * count
                    );
                }
            }
        }
        return maxValue[V.length-1][m];
    }
}