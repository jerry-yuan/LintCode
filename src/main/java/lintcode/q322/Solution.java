package lintcode.q322;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param queen:  queen‘coordinate
     * @param knight: knight‘coordinate
     * @return: if knight is attacked please return true，else return false
     */
    public boolean[] isAttacked(int[][] queen, int[][] knight) {
        // write your code here
        Set<Integer> xSets = new HashSet<>();
        Set<Integer> ySets = new HashSet<>();
        Set<Integer> xPySets = new HashSet<>();
        Set<Integer> xMySets = new HashSet<>();

        for (int[] axis : queen) {
            int x = axis[0];
            int y = axis[1];
            xSets.add(x);
            ySets.add(y);
            xPySets.add(x + y);
            xMySets.add(x - y);
        }
        boolean[] result = new boolean[knight.length];
        for (int i = 0; i < knight.length; i++) {
            int X = knight[i][0];
            int Y = knight[i][1];
            result[i] = xSets.contains(X) || ySets.contains(Y) || xPySets.contains(X + Y) || xMySets.contains(X - Y);
        }
        return result;

    }
}
