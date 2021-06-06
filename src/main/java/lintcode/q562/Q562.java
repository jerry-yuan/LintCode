package lintcode.q562;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q562 {
    public static void main(String[] args) {
        print(new Solution().backPackIV(
                intArray("[2,3,6,7]"),
                7
        ));
    }
}
