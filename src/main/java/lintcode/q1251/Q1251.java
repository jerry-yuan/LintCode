package lintcode.q1251;

import utils.JSONUtil;

public class Q1251 {
    public static void main(String[] args) {
        JSONUtil.print(new Solution().splitArray(
                JSONUtil.intArray("[2,3,1,2,4,3]"),
                5
        ));JSONUtil.print(new Solution().splitArray(
                JSONUtil.intArray("[1,4,4]"),
                3
        ));
    }
}
