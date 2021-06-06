package lintcode.q138;

import java.util.*;

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
        List<Integer> result=new ArrayList<>(2);
        Map<Integer,Integer> sumHistory=new HashMap<>();
        int sum=0;
        sumHistory.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sumHistory.containsKey(sum)){
                result.add(sumHistory.get(sum)+1);
                result.add(i);
                break;
            }
            sumHistory.put(sum,i);
        }
        return result;
    }
}
