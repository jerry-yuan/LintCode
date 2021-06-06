package lintcode.q110;

import static utils.JSONUtil.print;

public class Q110 {
    public static void main(String[] args) {
        print(new Solution().minPathSum(
                new int[][]{
                        {1,3,1},{1,5,1},{4,2,1}
                }
        ));
    }
}
