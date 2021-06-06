package lintcode.q172;

public class Solution {
    public int removeElement(int[] A, int elem) {
        // write your code here
        int length=A.length;
        for (int i = 0; i < length; i++) {
            if(A[i]==elem){
                length--;
                for (int j = i; j < length; j++) {
                    A[j]=A[j+1];
                }
                i--;
            }
        }
        return length;
    }
}
