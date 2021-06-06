package lintcode.q545;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q545 {
    public static void main(String[] args) {
        print(new Solution().topk(intArray("[3,10,1000,-99,4,100]"), 3));
        print(new Solution().topk(intArray("[9,3,2,4,8]"), 3));
        print(new Solution().topk(intArray("[1,2,3,4,5,6,8,9,10,7]"), 10));
    }
}
