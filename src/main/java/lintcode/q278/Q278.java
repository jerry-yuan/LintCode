package lintcode.q278;

import static utils.JSONUtil.intMatrix;
import static utils.JSONUtil.print;

public class Q278 {
    public static void main(String[] args) {
        print(new Solution().paintFill(intMatrix("[[2,2,5],[1,3,3]]"),1,1,4));
    }
}
