package lintcode.q485;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param size: An integer
     * @return: An integer list
     */
    public List<Integer> generate(int size) {
        // write your code here
        List<Integer> integers=new LinkedList<>();
        for (int i = 0; i < size; i++) {
            integers.add(i+1);
        }
        return integers;
    }
}
