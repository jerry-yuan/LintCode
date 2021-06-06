package lintcode.q1686;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q1686 {
    public static void main(String[] args) {
        print(new Solution().getMinimumNumOfBoots(
                10,
                4,
                intArray("[0,2,8,3,6,7,5,1,4,0]"),
                intArray("[2,4,3,7]"),
                intArray("[3,2,4,1]")
        ));
    }
}
