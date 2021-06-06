package lintcode.q101;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q101 {
    public static void main(String[] args) {
        print(new Solution().removeDuplicates(intArray("[1,1,1,2,2,3]")));
    }
}
