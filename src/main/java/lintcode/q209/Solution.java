package lintcode.q209;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
        // Write your code here
        char[] chars=str.toCharArray();
        Map<Character,Integer> dict=new HashMap<>();

        for(Character ch:chars){
            dict.put(ch,dict.getOrDefault(ch,0)+1);
        }

        for(Character ch:chars){
            if(dict.get(ch)==1){
                return ch;
            }
        }
        return 0;
    }
}
