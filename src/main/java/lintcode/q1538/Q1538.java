package lintcode.q1538;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q1538 {
    public static void main(String[] args) {
        print(
                new Solution().cardGame(
                        intArray("[1,2,3,4,5]"),
                        intArray("[1,2,3,4,5]"),
                        10,
                        10)
        );
        print(
                new Solution().cardGame(
                        intArray("[1,2]"),
                        intArray("[3,4]"),
                        10,
                        10)
        );
    }
}
