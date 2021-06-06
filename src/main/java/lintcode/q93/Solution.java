package lintcode.q93;
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if(root == null){
            return true;
        }
        return isBalanced(root.left)&&isBalanced(root.right)&&Math.abs(depth(root.left)-depth(root.right))<2;
    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int depth = 1;
        if(root.left != null){
            depth = Math.max(depth,depth(root.left)+1);
        }
        if(root.right != null){
            depth = Math.max(depth,depth(root.right)+1);
        }
        return depth;
    }
}
