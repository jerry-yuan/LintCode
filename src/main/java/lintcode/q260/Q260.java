package lintcode.q260;

import static utils.JSONUtil.intMatrix;
import static utils.JSONUtil.print;

public class Q260 {
    public static void main(String[] args) {
        print(new Solution().judgeSame(intMatrix("[[1, 2, 3], [5, 1, 2], [6, 5, 1]]")));
    }
}
