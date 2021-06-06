package lintcode.q255;

import static utils.JSONUtil.print;
import static utils.JSONUtil.stringArray;

public class Q255 {
    public static void main(String[] args) {
        print(new Solution().whetherStringsAreSubstrings("abc",stringArray("[\"ab\",\"cd\"]")));
    }
}
