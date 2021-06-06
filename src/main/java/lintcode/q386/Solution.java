package lintcode.q386;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Character, Integer> dict = new HashMap<>();

    /**
     * @param s: A string
     * @param k: An integer
     * @return: An integer
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // write your code here
        if (k <= 0) {
            return 0;
        }
        if (s.length() < k) {
            return s.length();
        }
        dict = new HashMap<>();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 1;
        int maxLength = 1;
        increaseCite(chars[0]);
        while (right < chars.length) {
            System.out.print("left=" + left + ",right=" + right + ",size=" + dict.size() + ",len="+maxLength+"\t");
            System.out.println(dict);

            if (dict.size() < k) {
                increaseCite(chars[right]);
                right++;
                maxLength = Math.max(maxLength, calLength(left, right));
            } else {
                decraseCite(chars[left]);
                left++;
            }
        }
        System.out.print("left=" + left + ",right=" + right + "\t");
        System.out.println(dict);
        return maxLength ;
    }

    public void increaseCite(char ch) {
        int cites = dict.getOrDefault(ch, 0);
        dict.put(ch, cites + 1);
    }

    public void decraseCite(char ch) {
        int cites = dict.getOrDefault(ch, 0);
        if (cites - 1 < 1) {
            dict.remove(ch);
        } else {
            dict.put(ch, cites - 1);
        }
    }

    public int calLength(int left, int right) {
        return right - left ;
    }
}