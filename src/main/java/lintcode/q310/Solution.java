package lintcode.q310;


public class Solution {
    /**
     * @param A: the integer discrible in problem
     * @return: the integer after distortion
     */
    public String Distortion(String A) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < A.length()/2; i++) {
            builder.append(A.charAt(A.length()-1-i));
            builder.append(A.charAt(i));
        }
        if(A.length()%2==1){
            builder.append(A.charAt(A.length()/2));
        }
        return builder.toString();
    }
}
