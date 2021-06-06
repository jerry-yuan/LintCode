package lintcode.q469;

public class Solution {
    /**
     * @param a: the root of binary tree a.
     * @param b: the root of binary tree b.
     * @return: true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // write your code here
        if(a==null && b==null){
            return true;
        }else if(a==null ^ b==null){
            return false;
        }
        if(a.val!=b.val){
            return false;
        }
        return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
    }
}
