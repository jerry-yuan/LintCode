package lintcode.q297;

import utils.JSONUtil;

import static utils.JSONUtil.print;

public class Q297 {
    public static void main(String[] args) {
        print(new Solution().maxNum(JSONUtil.intList("[1, 2, 3, 4, 5]")));
    }
}
