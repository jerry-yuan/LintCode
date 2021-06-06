package lintcode.q420;

import static utils.JSONUtil.print;

public class Q420 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            print(new Solution().countAndSay(i+1));
        }
    }
}
