package lintcode.q1281;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q1281 {
    public static void main(String[] args) {
        print(new Solution().topKFrequent(intArray("[1,1,1,2,2,3]"),2));
    }
}
