package lintcode.q798;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q798 {
    public static void main(String[] args) {
        print(new Solution().backPackVII(
                62,
                intArray("[4,20,8,3,9,1,13,15,6,12,2,8,5,11,13,14,6,15,2,5,14,13,14,4,3,13,4,9,14,3]"),
                intArray("[14,79,43,115,94,128,140,95,112,167,57,106,20,109,194,176,41,51,178,80,86,169,157,131,33,15,110,184,64,84]"),
                intArray("[16,1,19,13,1,6,16,15,19,15,4,1,4,8,14,9,1,3,18,17,17,15,7,15,14,16,15,18,17,14]")
        ));
        /*print(new Solution().backPackVII(
                8,
                intArray("[3,2]"),
                intArray("[300,160]"),
                intArray("[1,6]")
        ));*/
    }
}
