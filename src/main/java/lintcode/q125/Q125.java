package lintcode.q125;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q125 {
    public static void main(String[] args) {
        print(new Solution().backPackII(10,
                intArray("[2,3,5,7]"),
                intArray("[1,5,2,4]")));
    }
}
