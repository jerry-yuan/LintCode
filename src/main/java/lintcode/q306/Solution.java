package lintcode.q306;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    /**
     * @param offset: the number of items that the customer has viewed
     * @param n:      the number of items that can be displayed on a page
     * @param len1:   the length of L1
     * @param len2:   the length of L2
     * @return: returns the intervals of goods displayed in L1 and L2
     */
    public List<Integer> ProductList(int offset, int n, int len1, int len2) {
        // write your code here
        List<Integer> ranges = new ArrayList<>(4);
        int begin;
        int end;
        // 判断第一段
        begin = Math.max(Math.min(len1,offset), 0);
        end = Math.min(offset + n, len1);
        ranges.add(begin);
        ranges.add(end);
        // 判断第二段
        begin = Math.max(offset, len1);
        end = Math.min(Math.max(len1,offset + n), len1 + len2);
        ranges.add(begin - len1);
        ranges.add(end - len1);
        return ranges;
    }
}