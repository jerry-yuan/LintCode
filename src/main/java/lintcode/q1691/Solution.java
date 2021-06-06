package lintcode.q1691;

import java.util.PriorityQueue;

public class Solution {
    /**
     * @param a: the array a
     * @return: return the maximum profit
     */
    public int getAns(int[] a) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int res = 0;
        for(int i : a){
            if(q.size()>0&&i>q.peek()){
                res += i - q.poll();
                q.offer(i);
            }
            q.offer(i);
        }
        return res;
    }
}
