package lintcode.q633;

import utils.JSONUtil;

public class Q633 {
    public static void main(String[] args) {
        JSONUtil.print(new Solution().findDuplicate(JSONUtil.intArray("[5,5,4,3,2,1]")));
    }
}
