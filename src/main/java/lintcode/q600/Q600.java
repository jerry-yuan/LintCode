package lintcode.q600;

import static utils.JSONUtil.print;

public class Q600 {
    public static void main(String[] args) {
        print(new Solution().minArea(new char[][]{{0,0,1,0},{0,1,1,0},{0,1,0,0}},0,2));
        print(new Solution().minArea(new char[][]{
                {1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,1,1,1,1,1,0,0,0,0,0},
                {0,0,0,1,1,1,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0}
        },0,1));
    }
}
