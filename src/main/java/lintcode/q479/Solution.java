package lintcode.q479;

public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        int maxValue;
        int maxIndex;
        for (int i = 0; i < 2; i++) {
            maxValue=nums[i];
            maxIndex=i;
            for (int j = i; j < nums.length; j++) {
                if(maxValue<nums[j]){
                    maxValue=nums[j];
                    maxIndex=j;
                }
            }
            if(i!=maxIndex) {
                nums[i] = nums[maxIndex] ^ nums[i];
                nums[maxIndex] = nums[maxIndex] ^ nums[i];
                nums[i] = nums[maxIndex] ^ nums[i];
            }
        }
        return  nums[1];
    }
}
