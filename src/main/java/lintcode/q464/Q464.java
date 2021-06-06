package lintcode.q464;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q464 {
    public static void main(String[] args) {
        int[] data=intArray("[3,2,1,4,5]");
        new Solution().sortIntegers2(data);
        print(data);
    }
}
