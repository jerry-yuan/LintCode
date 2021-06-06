package lintcode.q397;

import static utils.JSONUtil.intArray;
import static utils.JSONUtil.print;

public class Q397 {
    public static void main(String[] args) {
        print(new Solution().longestIncreasingContinuousSubsequence(intArray("[5,4,2,1,3]")));
        print(new Solution().longestIncreasingContinuousSubsequence(intArray("[8,4,2,1]")));
    }
}
