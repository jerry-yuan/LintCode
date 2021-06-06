package lintcode.q322;

import static utils.JSONUtil.intMatrix;
import static utils.JSONUtil.print;

public class Q322 {
    public static void main(String[] args) {
        print(new Solution().isAttacked(intMatrix("[[1,1],[2,2]]"),intMatrix("[[3,3],[1,3],[4,5]]")));
    }
}
