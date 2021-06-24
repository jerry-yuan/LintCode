package lintcode.q297;

import java.util.List;

public class Solution {
    /**
     * @param nums: the list of numbers
     * @return: return the maximum number.
     */
    public int maxNum(List<Integer> nums) {
        // write your code here
        int max=Integer.MIN_VALUE;
        for (Integer i : nums) {
            max=Math.max(max,i);
        }
        return max;
    }
}