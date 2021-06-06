package lintcode.q1680;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q1680 {
    public static void main(String[] args) {
        print(new Solution().getApplicant(
                intArray("[2,5,4,3]"),
                intArray("[2,3,4]"),
                intArray("[1,2,2]"),
                intArray("[3,4,4]")
        ));


        print(new Solution().getApplicant(
                intArray("[225657656,994645291,999202796,999202796,999202796,942745784,962612348,842542128,73554493,491166]"),
                intArray("[768987635,223039613,169200644,4066339,52812425,16184563,44670,2618043,4032936,446496]"),
                intArray("[2,1,6,3,7,7,3,1,7,3]"),
                intArray("[8,5,7,9,9,9,10,5,7,10]")));
    }
}
