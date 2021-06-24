package lintcode.q1910;

import utils.JSONUtil;

import static utils.JSONUtil.print;

public class Q1910 {
    public static void main(String[] args) {
        print(new Solution().findNumber(JSONUtil.intArray("[1,1,2,3,3,3,4,5]")));
        print(new Solution().findNumber(JSONUtil.intArray("[1]")));
    }
}
