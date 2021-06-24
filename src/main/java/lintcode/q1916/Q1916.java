package lintcode.q1916;

import utils.JSONUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utils.JSONUtil.print;

public class Q1916 {
    public static void main(String[] args) {
        print(new Solution().longestLightingTime(transform(JSONUtil.intMatrix("[[0,2],[1,5],[0,9],[2,15]]"))));
    }

    public static List<List<Integer>> transform(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>(matrix.length);
        for (int[] row : matrix) {
            List<Integer> theRow = new ArrayList<>(row.length);
            for (int i : row) {
                theRow.add(i);
            }
            list.add(new ArrayList<>(theRow));
        }
        return list;
    }
}
