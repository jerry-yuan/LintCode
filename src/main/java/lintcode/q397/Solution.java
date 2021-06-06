package lintcode.q397;

public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        int maxIncrease = maxIncreaseSubSequence(A);
        reverse(A);
        int maxDecrease = maxIncreaseSubSequence(A);
        return Math.max(maxIncrease,maxDecrease);
    }
    private void reverse(int[] A){
        for (int i = 0; i < (A.length) / 2; i++) {
            A[i] = A[i] ^ A[A.length-i-1];
            A[A.length-i-1] = A[i] ^ A[A.length-i-1];
            A[i] = A[i] ^ A[A.length-i-1];
        }
    }
    private int maxIncreaseSubSequence(int[] A){
        int maxLength=0;
        int l=0;
        int r=0;
        int current=Integer.MIN_VALUE;
        while(l<A.length && r<A.length){
            if(A[r]>current){
                current=A[r];
                maxLength=Math.max(maxLength,r-l+1);
                r++;
            }else{
                l=r;
                current=Integer.MIN_VALUE;
            }
        }
        return maxLength;
    }
}
