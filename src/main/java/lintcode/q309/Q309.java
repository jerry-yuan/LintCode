package lintcode.q309;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q309 {
    public static void main(String[] args) {
        print(new Solution().interleavedArray(intArray("[1,2]"),intArray("[3,4]")));
    }
}
