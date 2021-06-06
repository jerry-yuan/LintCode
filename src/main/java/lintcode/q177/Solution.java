package lintcode.q177;

public class Solution {
    /*
     * @param A: an integer array
     * @return: A tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        // write your code here
        return sortedArrayToBST(A,0,A.length-1);
    }
    public TreeNode sortedArrayToBST(int[] A,int from,int to){
        int mid=(from+to)/2;
        TreeNode treeNode=new TreeNode(A[mid]);
        if(from<mid){
            treeNode.left=sortedArrayToBST(A,from,mid-1);
        }
        if(mid<to){
            treeNode.right=sortedArrayToBST(A,mid+1,to);
        }
        return treeNode;
    }
}
