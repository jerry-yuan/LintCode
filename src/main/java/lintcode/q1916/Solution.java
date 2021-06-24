package lintcode.q1916;

import java.util.List;

public class Solution {
    /**
     * 尝试在Javadoc里边写video
     * <img src="https://www.baidu.com/img/pc_629ee8886a9c20e7f3cb1d2889c3e45d.gif" />
     * @param operation
     * @return
     */
    public char longestLightingTime(List<List<Integer>> operation) {
        // write your code here
        int currentTime = 0;
        int longestTime = 0;
        int longestLamp = -1;
        for (List<Integer> op : operation) {
            int lampId = op.get(0);
            int stopTime = op.get(1);
            int duration=stopTime-currentTime;
            currentTime=stopTime;
            if(duration>longestTime){
                longestLamp=lampId;
                longestTime=duration;
            }
        }
        return (char) ('a'+ longestLamp);
    }
}
