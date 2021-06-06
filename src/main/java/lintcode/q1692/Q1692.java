package lintcode.q1692;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q1692 {
    public static void main(String[] args) {
        print(new Solution().getAns(intArray("[43,25,33,17]"),intArray(" [41,41,17,11]")));
        print(new Solution().getAns(intArray("[43,25,33,17,21,4,37,49,7,17]"),intArray("[41,41,17,11,20,31,17,17,11,29]")));
    }
}
