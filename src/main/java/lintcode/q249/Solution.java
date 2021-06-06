package lintcode.q249;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param A: an integer array
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> countOfSmallerNumberII(int[] A) {
        // write your code here
        Math.abs(122);
        List<Integer> result=new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            int count=0;
            for (int j = 0; j < i; j++) {
                count+=A[i]>A[j]?1:0;
            }
            result.add(count);
        }
        return result;
    }
}
