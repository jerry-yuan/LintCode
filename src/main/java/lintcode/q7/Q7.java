package lintcode.q7;

import utils.TreeUtil;

import static utils.JSONUtil.print;

public class Q7 {
    public static void main(String[] args) {
        print(new Solution2().serialize(TreeUtil.deserializeAsIntegerTree("{3,9,20,#,#,15,7}", new TreeUtil.TreeNodeFactory<TreeNode, Integer>() {

            @Override
            public TreeNode factory(Integer val) {
                return new TreeNode(val);
            }

            @Override
            public void setLeft(TreeNode root, TreeNode left) {
                root.left=left;
            }

            @Override
            public void setRight(TreeNode root, TreeNode right) {
                root.right=right;
            }

            @Override
            public void setValue(TreeNode root, Integer value) {
                root.val=value;
            }
        })));
    }
}
