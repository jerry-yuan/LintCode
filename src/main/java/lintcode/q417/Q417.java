package lintcode.q417;

import static utils.JSONUtil.print;

public class Q417 {
    public static void main(String[] args) {
        print(new Solution().isNumber("0"));
        print(new Solution().isNumber("0.1"));
        print(new Solution().isNumber("abc"));
        print(new Solution().isNumber("1 a"));
        print(new Solution().isNumber("1e4"));
    }
}
