package lintcode.q11;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    /**
     * @param root: param root: The root of the binary search tree
     * @param k1: An integer
     * @param k2: An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        List<Integer> integers=new LinkedList<>();
        if(root==null){
            return integers;
        }
        if(k1<root.val){
            integers.addAll(searchRange(root.left,k1,k2));
        }
        if(k1<=root.val && root.val<=k2){
            integers.add(root.val);
        }
        if(root.val<k2){
            integers.addAll(searchRange(root.right,k1,k2));
        }
        return integers;
    }
}
