package lintcode.q1910;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param array: An array.
     * @return: An integer.
     */
    public int findNumber(int[] array) {
        // Write your code here.
        Map<Integer, Integer> history = new HashMap<>();
        int max = -1;
        int value = -1;
        for (int i : array) {
            int times=history.getOrDefault(i,0);
            times++;
            if(max<times){
                max=times;
                value=i;
            }else if(max==times && i<value){
                value=i;
            }
            history.put(i,times);
        }
        return value;
    }
}
