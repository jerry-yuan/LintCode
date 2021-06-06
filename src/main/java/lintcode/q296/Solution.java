package lintcode.q296;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    /**
     * @param arr: a integer array
     * @return: return the unique array
     */
    public int[] getUniqueArray(int[] arr) {
        // write your code here
        int[] buffer=new int[arr.length];
        int rIndex=0;
        Set<Integer> existedInteger=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!existedInteger.contains(arr[i])){
                existedInteger.add(arr[i]);
                buffer[rIndex++]=arr[i];
            }
        }
        int[] result=new int[rIndex];
        System.arraycopy(buffer,0,result,0,rIndex);
        return result;

    }
}