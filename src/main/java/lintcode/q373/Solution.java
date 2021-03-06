package lintcode.q373;

public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        // write your code here
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[right] % 2 == 0) right--;
            while (left < right && nums[left] % 2 == 1) left++;
            if (left != right) {
                nums[left] = nums[left] ^ nums[right];
                nums[right] = nums[left] ^ nums[right];
                nums[left] = nums[left] ^ nums[right];
            }
        }
    }
}
