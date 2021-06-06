package lintcode.q100;

public class Solution {
    public int removeDuplicates(int[] nums) {
        // write your code here
        int length=nums.length;
        for(int i=1;i<length;i++){
            if(nums[i-1]==nums[i]){
                length--;
                for(int j=i;j<length;j++){
                    nums[j]=nums[j+1];
                }
                i--;
            }
        }
        return length;
    }
}
