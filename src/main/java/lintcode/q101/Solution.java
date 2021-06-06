package lintcode.q101;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] A) {
        // write your code here
        Map<Integer,Integer> times=new HashMap<>();
        int length = A.length;
        for(int i=0;i<length;i++){
            int time=times.getOrDefault(A[i],0);
            if(time>=2){
                length--;
                for(int j=i;j<length;j++){
                    A[j]=A[j+1];
                }
                i--;
            }else{
                times.put(A[i],time+1);
            }
        }
        return length;
    }
}
