package lintcode.q23;

import static utils.JSONUtil.print;

public class Q23 {
    public static void main(String[] args) {
        print(new Solution().isAlphanumeric('1'));
        print(new Solution().isAlphanumeric('A'));
        print(new Solution().isAlphanumeric('v'));
        print(new Solution().isAlphanumeric(','));
        print(new Solution().isAlphanumeric('"'));
        print(new Solution().isAlphanumeric('~'));

    }
}
