package lintcode.q207;

public class Solution {
    private TreeNode tree = null;

    /*
     * @param A: An integer array
     */
    public Solution(int[] A) {
        // do intialization if necessary
        if(A.length>0)
        tree = new TreeNode(A);
    }
    /* you may need to use some attributes here */

    /*
     * @param start: An integer
     * @param end: An integer
     * @return: The sum from start to end
     */
    public long query(int start, int end) {
        // write your code here
        return tree.getRange(start, end);
    }

    /*
     * @param index: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void modify(int index, int value) {
        // write your code here
        tree.modify(index,value);
    }

    static class TreeNode {
        public long sum;
        public final int start;
        public final int mid;
        public final int end;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int[] A) {
            this(A, 0, A.length - 1);
        }

        public TreeNode(int[] A, int from, int to) {
            this.start = from;
            this.end = to;
            this.mid = (from + to) / 2;
            if (from != to) {
                left = new TreeNode(A, from, this.mid);
                right = new TreeNode(A, this.mid + 1, to);
                sum = left.sum + right.sum;
            } else {
                sum = A[from];
            }
        }

        public long getRange(int start, int end) {
            long result = 0;
            if (start == this.start && end == this.end) {
                return sum;
            } else {
                if (start <= this.mid) {
                    result += this.left.getRange(start, Math.min(end,this.mid));
                }
                if (this.mid < end) {
                    result += this.right.getRange(Math.max(start,this.mid+1), end);
                }
                return result;
            }
        }
        public long modify(int index,int value){
            long dsum;
            if(this.start==this.end && this.start==index){
                dsum = value - this.sum;
            }else{
                if(index <= this.mid){
                    dsum = this.left.modify(index,value);
                }else {
                    dsum = this.right.modify(index, value);
                }
            }
            this.sum+=dsum;
            return dsum;
        }
    }
}