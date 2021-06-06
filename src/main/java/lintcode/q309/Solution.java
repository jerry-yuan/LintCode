package lintcode.q309;

public class Solution {
    /**
     * @param A: the array A
     * @param B: the array B
     * @return: returns an alternate array of arrays A and B.
     */
    public int[] interleavedArray(int[] A, int[] B) {
        // Interleaved Array
        int[] result=new int[A.length+B.length];
        int rIndex=0;
        for (int i = 0; i <A.length; i++) {
            result[rIndex++]=A[i];
            result[rIndex++]=B[i];
        }
        return result;
    }
}