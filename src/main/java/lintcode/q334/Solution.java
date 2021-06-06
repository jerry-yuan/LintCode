package lintcode.q334;

import java.util.*;

public class Solution {
    /**
     * @param heights: Students height
     * @return: How many people are not where they should be
     */
    public int orderCheck(List<Integer> heights) {
        // write your code here
        PriorityQueue<Integer> procQueue = new PriorityQueue<>(heights);
        Queue<Integer> rawQueue=new LinkedList<>(heights);
        int count=0;
        for (int i = 0; i < heights.size(); i++) {
            count += !Objects.equals(rawQueue.poll(), procQueue.poll())?1:0;
        }
        return count;
    }
}