package lintcode.q1251;

public class Solution {
    /**
     * @param nums: a list of integers
     * @param m:    an integer
     * @return: return a integer
     */
    public int splitArray(int[] nums, int m) {
        // write your code here
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - m; i++) {
            System.out.println(i + "-" + Math.max(sumBefore(nums, 0, i), splitArray(nums, i + 1, m - 1)));
            min = Math.min(min, Math.max(sumBefore(nums, 0, i), splitArray(nums, i + 1, m - 1)));
            //min=Math.min(min,);

        }
        return min;
    }

    public int splitArray(int[] nums, int begin, int parts) {
        int max = Integer.MIN_VALUE;
        if (parts <= 1) {
            max = Math.max(max, sumBefore(nums, begin, nums.length - 1));
        } else {
            for (int i = begin; i < nums.length - parts; i++) {
                max = Math.max(max, sumBefore(nums, begin, i));
                max = Math.max(max, splitArray(nums, i + 1, parts - 1));
            }
        }

        return max;
    }

    public int sumBefore(int[] nums, int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end && i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}