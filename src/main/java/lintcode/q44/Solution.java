package lintcode.q44;

import java.util.List;

public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> numList) {
        // write your code here
        int[] nums = numList.stream().mapToInt(Integer::intValue).toArray();
        return minSubArray(nums);
    }

    public int minSubArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                min = Math.min(sum, min);
            }
        }
        return min;
    }
}
