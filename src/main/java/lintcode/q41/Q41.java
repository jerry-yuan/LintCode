package lintcode.q41;

import utils.JSONUtil;

import static utils.JSONUtil.print;

public class Q41 {
    public static void main(String[] args) {
        print(new Solution().maxSubArray(JSONUtil.intArray("[-2,2,-3,4,-1,2,1,-5,3]")));
    }
}
