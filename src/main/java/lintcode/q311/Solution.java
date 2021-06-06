package lintcode.q311;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /**
     * @param s: A string containing only uppercase and lowercase letters
     * @return: Judge whether it can become a palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean hasOdd = false;
        for (Integer count : countMap.values()) {
            if(count%2==1){
                if(hasOdd){
                    return false;
                }
                hasOdd=true;
            }
        }
        return true;
    }
}