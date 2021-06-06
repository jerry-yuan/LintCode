package lintcode.q50;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        long total = 1;
        List<Long> result = new LinkedList<>();
        for(int i=0;i<nums.size();i++){
            total=1;
            for(int j=0;j<nums.size();j++){
                if(i!=j) {
                    total *= nums.get(j);
                }
            }
            result.add(total);
        }
        return result;
    }
}