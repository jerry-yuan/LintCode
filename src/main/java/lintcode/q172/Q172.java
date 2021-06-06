package lintcode.q172;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q172 {
    public static void main(String[] args) {
        print(new Solution().removeElement(intArray("[0,4,4,0,0,2,4,4]"),4));
    }
}
