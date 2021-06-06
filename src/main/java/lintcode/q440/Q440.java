package lintcode.q440;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q440 {
    public static void main(String[] args) {
        print(new Solution().backPackIII(
                intArray("[2,3,5,7]"),
                intArray("[1,5,2,4]"),
                10
        ));
    }
}
