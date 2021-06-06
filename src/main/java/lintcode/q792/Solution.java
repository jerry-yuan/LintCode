package lintcode.q792;

import java.util.Arrays;

import static utils.JSONUtil.print;


public class Solution {
    /**
     * @param n: the number
     * @return: the rank of the number
     */
    public int kthPrime(int n) {
        // write your code here
        int[] table = new int[n - 1];
        Arrays.fill(table, 1);
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (table[i] == 1) {
                index++;
                for (int j = 2; j < n - 1 && j * (i + 2)-2 < n - 1; j++) {
                    table[j * (i + 2)-2] = 0;
                }
            }
        }
        print(table);
        return index;
    }
}