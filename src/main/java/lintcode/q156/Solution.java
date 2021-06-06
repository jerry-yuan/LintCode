package lintcode.q156;

import java.util.*;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if(intervals.isEmpty()){
            return intervals;
        }
        intervals=new ArrayList<>(intervals);
        intervals.sort(Comparator.comparing(i->i.start));
        Queue<Interval> queue=new LinkedList<>(intervals);
        List<Interval> result=new LinkedList<>();
        Interval interval=queue.poll();
        while(!queue.isEmpty()){
            Interval another=queue.poll();
            assert interval != null;
            if(Math.max(interval.start,another.start)<=Math.min(interval.end,another.end)){
                interval.start=Math.min(interval.start,another.start);
                interval.end=Math.max(interval.end,another.end);
            }else{
                result.add(interval);
                interval=another;
            }
        }
        result.add(interval);
        return result;
    }
}
