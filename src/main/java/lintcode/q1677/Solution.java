package lintcode.q1677;

import java.util.PriorityQueue;

public class Solution {
    /**
     * @param p: the position of the i-th stone
     * @param d: how far the stones can be stone
     * @return: the distance from the start point to the farthest stone.
     */
    public int getDistance(int[] p, int[] d) {
        // Write your code here.
        PriorityQueue<Stone> stones = new PriorityQueue<>();
        for (int i = 0, len = p.length; i < len; i++) {
            stones.offer(new Stone(p[i], d[i]));
        }
        boolean jump = true;
        Stone farthestStone = null;
        while (!stones.isEmpty()) {
            Stone meet = stones.poll();
            jump = !jump;
            if (jump) {
                farthestStone = meet;
                continue;
            }
            meet.throwMe();
            stones.offer(meet);
        }
        return farthestStone==null?0:farthestStone.position;
    }

    public static class Stone implements Comparable<Stone> {
        int position;
        int throwDist;

        public Stone(int position, int throwDist) {
            this.position = position;
            this.throwDist = throwDist;
        }

        public void throwMe() {
            position += throwDist;
        }

        @Override
        public int compareTo(Stone o) {
            int intCmp = Integer.compare(position, o.position);
            if (intCmp != 0) {
                return intCmp;
            }
            return Integer.compare(throwDist, o.throwDist);
        }
    }
}