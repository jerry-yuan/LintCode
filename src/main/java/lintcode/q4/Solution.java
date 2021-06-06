package lintcode.q4;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Solution {
    /**
     * @param n: An integer
     * @return: return a  integer as description.
     */
    public int nthUglyNumber(int n) {
        // write your code here
        Queue<Long> queue = new PriorityQueue<>();
        Set<Long> generatedNumbers = new HashSet<>();

        long[] primary = new long[]{2, 3, 5};
        for (long number : primary) {
            queue.add(number);
            generatedNumbers.add(number);
        }
        Long number= 1L;

        for(int i=1;i<n;i++){
            number=queue.poll();
            for(long num:primary){
                if(!generatedNumbers.contains(number*num)){
                    queue.add(number*num);
                    generatedNumbers.add(number*num);
                }
            }
        }
        return number.intValue();
    }
}