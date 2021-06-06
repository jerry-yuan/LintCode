package lintcode.q1421;

import utils.JSONUtil;

public class Q1421 {
    public static void main(String[] args) {
        System.out.println(new Solution().MatrixGame(new int[][]{
                JSONUtil.intArray("[1,4,7]"),
                JSONUtil.intArray("[2,5,8]"),
                JSONUtil.intArray("[3,6,9]")
        }));
    }
}
