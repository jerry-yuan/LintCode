package lintcode.q389;

import static utils.JSONUtil.charMatrix;
import static utils.JSONUtil.print;

public class Q389 {
    public static void main(String[] args) {
        char[][] data=charMatrix("[\"53..7....\",\"6..195...\",\".98....6.\",\"8...6...3\",\"4..8.3..1\",\"7...2...6\",\".6....28.\",\"...419..5\",\"....8..79\"]");
        print(new Solution().isValidSudoku(data));
    }
}
