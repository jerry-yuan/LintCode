package lintcode.q1683;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    /**
     * @param n:
     * @param v:
     * @return: nothing
     */
    public int killMonster(int n, int[][] v) {
        Guy altMan = new Guy(v[0]);
        Queue<Guy> monsters = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            monsters.offer(new Guy(v[i]));
        }
        int killed = 0;
        int i = 0;
        while (!monsters.isEmpty() && i < monsters.size()) {
            Guy monster = monsters.poll();
            if (monster.compareTo(altMan) <= 0) {
                killed++;
                altMan.eat(monster);
                i = 0;
            } else {
                monsters.offer(monster);
                i++;
            }
        }
        return killed;
    }



    private static class Guy implements Comparable<Guy> {
        int[] ap;

        public Guy(int[] ap) {
            this.ap = ap;
        }

        public void eat(Guy monster) {
            for (int i = 0; i < 5; i++) {
                ap[i] += monster.ap[i];
            }
        }

        @Override
        public int compareTo(Guy o) {
            boolean isLarger = false;
            int larger = 0;
            int smaller = 0;
            for (int i = 0; i < 5; i++) {
                if (this.ap[i] < o.ap[i]) {
                    smaller++;
                } else if (this.ap[i] > o.ap[i]) {
                    larger++;
                }
            }
            return larger > 0 ? 1 : (smaller > 0 ? -1 : 0);
        }
    }
}