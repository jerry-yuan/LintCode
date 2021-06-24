package lintcode.q1613;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    /**
     * @param ipLines: ip  address
     * @return: return highestFrequency ip address
     */
    public String highestFrequency(String[] ipLines) {
        // Write your code here
        Map<String, Integer> ipTimes = new HashMap<>();
        for (String ip : ipLines) {
            Integer times = ipTimes.getOrDefault(ip, 0);
            times++;
            ipTimes.put(ip, times);
        }
        Iterator<Map.Entry<String,Integer>> iterator=ipTimes.entrySet().iterator();
        if(!iterator.hasNext()){
            return null;
        }
        Map.Entry<String,Integer> theEntry=iterator.next();
        int max=theEntry.getValue();
        String ip=theEntry.getKey();
        while(iterator.hasNext()){
            theEntry=iterator.next();
            if(theEntry.getValue()>max){
                ip=theEntry.getKey();
                max=theEntry.getValue();
            }
        }
        return ip;
    }
}