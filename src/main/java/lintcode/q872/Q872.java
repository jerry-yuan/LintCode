package lintcode.q872;

import static utils.JSONUtil.intList;
import static utils.JSONUtil.print;

public class Q872 {
    public static void main(String[] args) {
        print(new Solution().killProcess(intList("[1, 3, 10, 5]"),intList("[3, 0, 5, 3]"),5));
    }
}
