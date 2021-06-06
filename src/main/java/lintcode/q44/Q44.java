package lintcode.q44;

import static utils.JSONUtil.intList;
import static utils.JSONUtil.print;

public class Q44 {
    public static void main(String[] args) {
        print(new Solution().minSubArray(intList("[1,-1,-2,1]")));
    }
}
