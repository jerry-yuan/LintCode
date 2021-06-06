package lintcode.q277;

import static utils.JSONUtil.print;
import static utils.JSONUtil.stringList;

public class Q277 {
    public static void main(String[] args) {
        print(new Solution().wordSpacing(stringList("[\"hello\",\"world\",\"say\",\"hello\"]"), "hello", "world"));
    }
}
