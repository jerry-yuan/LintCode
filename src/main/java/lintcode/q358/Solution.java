package lintcode.q358;

public class Solution {
    /**
     * @param trees: the positions of trees.
     * @param d: the minimum beautiful interval.
     * @return: the minimum number of trees to remove to make trees beautiful.
     */
    public int treePlanning(int[] trees, int d) {
        // write your code here.
        int front=0;
        int count=0;
        for (int i = 0; i < trees.length; i++) {
            if(trees[i]-trees[front]<d){
                count++;
            }else{
                front=i;
            }
        }
        return count;
    }
}