package lintcode.q445;

public class Solution {
    /*
     * @param A: An integer array
     * @param B: An integer array
     * @return: Cosine similarity
     */
    public double cosineSimilarity(int[] A, int[] B) {
        // write your code here
        if(A.length==0 || B.length ==0){
            return 2.000f;
        }
        double top=0;
        double bottomLeft=0;
        double bottomRight=0;
        for (int i = 0; i < A.length; i++) {
            top += A[i]*B[i];
            bottomLeft += A[i]*A[i];
            bottomRight += B[i]*B[i];
        }
        double bottom=Math.sqrt(bottomLeft)+Math.sqrt(bottomRight);
        if(Math.abs(bottom-0f)<10e-6){
            return 2.000f;
        }
        return top/bottom;
    }
}
