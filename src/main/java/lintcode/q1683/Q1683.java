package lintcode.q1683;

import static utils.JSONUtil.print;

public class Q1683 {
    public static void main(String[] args) {
        print(new Solution().killMonster(
                2,
                new int[][]{
                        new int[]{1, 1, 1, 1, 1},
                        new int[]{1, 1, 1, 1, 1},
                        new int[]{2, 2, 2, 2, 2}
                }
        ));
        print(new Solution().killMonster(
                4,
                new int[][]{
                        new int[]{1, 2, 7, 5, 8},
                        new int[]{4, 5, 4, 4, 6},
                        new int[]{1, 2, 1, 5, 8},
                        new int[]{8, 2, 9, 5, 9},
                        new int[]{2, 7, 8, 0, 0}
                }
        ));
    }
}
