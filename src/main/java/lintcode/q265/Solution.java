package lintcode.q265;

public class Solution {
    /**
     * @param A: an integer array
     * @return: return maxium contiguous non-negative subarray sum
     */
    public int maxNonNegativeSubArray(int[] A) {
        // write your code here
        int negativeCount=0;
        for(int a:A){
            negativeCount+=a<0?1:0;
        }
        if(negativeCount>=A.length){
            return -1;
        }
        int end=0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        while(end<A.length){
            if(A[end]<0){
                end=end+1;
                maxSum=Math.max(maxSum,sum);
                sum=0;
            }else{
                sum+=A[end];
                end++;
            }
        }
        maxSum=Math.max(maxSum,sum);
        return maxSum;
    }
}