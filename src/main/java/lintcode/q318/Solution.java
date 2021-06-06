package lintcode.q318;


import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param A: A string
     * @param B: A string
     * @return: A string array
     */
    public List<String> characterGrid(String A, String B) {
        // write your code here.
        int APosition=0,BPosition=0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if(A.charAt(i)==B.charAt(j)){
                    BPosition=i;
                    APosition=j;
                    i=j=Math.max(A.length(),B.length());
                }
            }
        }
        List<String> result=new LinkedList<>();
        for (int i = 0; i < B.length(); i++) {
            if(i==APosition){
                result.add(A);
            }else{
                StringBuilder builder=new StringBuilder();
                for (int j = 0; j < BPosition; j++) {
                    builder.append(".");
                }
                builder.append(B.charAt(i));
                for (int j = BPosition+1; j < A.length(); j++) {
                    builder.append(".");
                }
                result.add(builder.toString());
            }
        }
        return result;
    }
}
