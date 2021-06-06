package lintcode.q250;

import static utils.JSONUtil.print;
import static utils.JSONUtil.stringList;

public class Q250 {
    public static void main(String[] args) {
        print(new Solution().ispalindrome(
            stringList("[\"at\", \"by\", \"yh\", \"hn\", \"mw\", \"ww\"]"),
                "swims"

        ));
        print(new Solution().ispalindrome(
            stringList("[\"at\", \"by\", \"yh\", \"hn\", \"mw\", \"ww\"]"),
                "hob"

        ));

    }
}
