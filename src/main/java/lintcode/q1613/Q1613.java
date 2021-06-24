package lintcode.q1613;

import utils.JSONUtil;

import static utils.JSONUtil.print;

public class Q1613 {
    public static void main(String[] args) {
        print(new Solution().highestFrequency(JSONUtil.stringArray("[\"192.168.1.1\",\"192.118.2.1\",\"192.168.1.1\"]")));
        print(new Solution().highestFrequency(JSONUtil.stringArray("[\"192.168.1.1\",\"192.118.2.1\",\"192.168.1.1\",\"192.118.2.1\",\"192.118.2.1\"]")));
    }
}
