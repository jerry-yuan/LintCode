package lintcode.q770;

import java.util.Arrays;

public class Solution {
    /**
     * @param matrix: an input matrix
     * @return: nums[0]: the maximum,nums[1]: the minimum
     */
    public int[] maxAndMin(int[][] matrix) {
        // write your code here
        if(matrix.length==0){
            return new int[0];
        }
        int[] result=new int[2];
        result[0]=Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt();
        result[1]=Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt();
        return result;
    }
}