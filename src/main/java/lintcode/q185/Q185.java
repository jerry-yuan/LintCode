package lintcode.q185;

import static utils.JSONUtil.print;

public class Q185 {
    public static void main(String[] args) {
        print(new Solution().printZMatrix(new int[][]{
                {1, 2,  3,  4},
                {5, 6,  7,  8},
                {9,10, 11, 12}
        }));
    }
}
