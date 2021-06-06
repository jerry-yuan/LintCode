package lintcode.q359;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    /**
     * @param lengths: the lengths of sticks at the beginning.
     * @return: return the minimum number of cuts.
     */
    public int makeEquilateralTriangle(int[] lengths) {
        // write your code here.
        HashMap<Integer,Integer> count=new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < lengths.length; i++) {
            maxLength = Math.max(maxLength,lengths[i]);
            minLength = Math.min(minLength,lengths[i]);
            count.put(lengths[i],count.getOrDefault(lengths[i],0)+1);
        }
        int maxTimes=count.values().stream().sorted(Comparator.reverseOrder()).findFirst().get();
        if(maxTimes>=3){
            return 0;
        }else if(maxTimes==2 && maxLength>minLength){
            return 1;
        }else if(maxLength==minLength*2){
            return 1;
        }else{
            return 2;
        }
    }
}
