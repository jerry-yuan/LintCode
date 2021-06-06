package lintcode.q373;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q373 {
    public static void main(String[] args) {
        int[] arr=intArray("[1,4,2,3,5,6]");
        new Solution().partitionArray(arr);
        print(arr);
    }
}
