package lintcode.q265;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q265 {
    public static void main(String[] args) {
        print(new Solution().maxNonNegativeSubArray(intArray("[1,2,-3,4,5,-6]")));
    }
}
