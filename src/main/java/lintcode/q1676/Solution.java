package lintcode.q1676;

import java.util.List;

public class Solution {
    /**
     * @param n:      The total number of stones.
     * @param m:      The total number of stones you can remove.
     * @param target: The distance from the end to the starting point.
     * @param d:      The array that the distance from the i rock to the starting point is d[i].
     * @return: Return the maximum value of the shortest jump distance.
     */
    public int getDistance(int n, int m, int target, List<Integer> d) {
        // Write your code here.
        d.add(target);
        System.out.println(d);
        for (int i = d.size() - 1; i > 0; i--) {
            d.set(i, d.get(i) - d.get(i - 1));
        }
        while (m > 0 && d.size() > 1) {
            removeMin(d);
            m--;
        }
        return d.get(min(d));
    }

    public int min(List<Integer> d) {
        int index = 0;
        int min = d.get(index);
        for (int i = 1; i < d.size(); i++) {
            if (d.get(i) < min) {
                index = i;
                min = d.get(i);
            }
        }
        return index;
    }

    public void removeMin(List<Integer> d) {

        int index = min(d);
        if (index == 0) {
            // first stones
            d.set(1, d.get(1) + d.get(0));
            d.remove(0);
        } else if (index == d.size() - 1) {
            // last stones
            d.set(d.size() - 2, d.get(d.size() - 1) + d.get(d.size() - 2));
            d.remove(d.size() - 1);
        } else {
            // middle stones
            d.set(index + 1, d.get(index + 1) + d.get(index));
            d.remove(index);
        }
    }
}
