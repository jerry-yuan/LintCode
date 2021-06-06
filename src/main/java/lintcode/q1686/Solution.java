package lintcode.q1686;

public class Solution {
    /**
     * @param brickCount:     The number of bricks.
     * @param bootCount:      The number of boots.
     * @param snowThickesses: The thickness of snow on bricks.
     * @param maxDepths:      The boots maximum depth of walking.
     * @param ages:           The boots maximum length of walking.
     * @return: Return the minimum number of boots you should discard.
     */
    public int getMinimumNumOfBoots(int brickCount, int bootCount, int[] snowThickesses, int[] maxDepths, int[] ages) {
        // Write your code here.
        //int[] minBootsDroped = new int[bootCount][brickCount + 1];
        // TODO:不会了
        return 0;
    }

    private Boot[] makeBoots(int[] maxDepths, int[] ages) {
        Boot[] boots = new Boot[maxDepths.length];
        for (int i = 0; i < maxDepths.length; i++) {
            boots[i] = new Boot(maxDepths[i], ages[i]);
        }
        return boots;
    }

    public static class Boot {
        int maxDepth;
        int age;

        public Boot(int maxDepth, int age) {
            this.maxDepth = maxDepth;
            this.age = age;
        }
    }
}
