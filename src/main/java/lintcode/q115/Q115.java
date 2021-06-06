package lintcode.q115;

import static utils.JSONUtil.print;


public class Q115 {
    public static void main(String[] args) {
        print(new Solution().uniquePathsWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        }));
    }
}
