package lintcode.q323;

import java.util.HashMap;

public class Solution {
    /**
     * @param s: a string for this game
     * @return: return whether Alice can win this game
     */
    public boolean stringGame(String s) {
        // Write your code here
        HashMap<Character,Integer> count=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }
        int xor=0;
        for (Integer cnt:count.values()) {
            xor^= cnt;
        }
        return xor==0;
    }
}
