package lintcode.q1687;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Long> longs = new ArrayList<>();

    /**
     * @param n: The param n means 2*n rectangular square.
     * @return: Return the total schemes.
     */
    public long getTotalSchemes(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        // Write your code here.
        long result;
        if (longs.size() <= n) {
            result = getTotalSchemes(n - 1) + getTotalSchemes(n - 2);
            longs.add(result);
        } else {
            result = longs.get(n);
        }
        return result;
    }
}