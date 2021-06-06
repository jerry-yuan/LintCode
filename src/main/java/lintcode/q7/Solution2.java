package lintcode.q7;

import java.util.*;

public class Solution2 {

    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        StringBuilder builder=new StringBuilder();
        serializeWalk(root,builder);
        return builder.toString();
    }
    private void serializeWalk(TreeNode root,StringBuilder builder){
        if(root==null){
            builder.append("#").append("\n");
        }else{
            builder.append(root.val).append("\n");
            serializeWalk(root.left,builder);
            serializeWalk(root.right,builder);
        }
    }
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        return deserializeWalk(new Scanner(data));
    }
    private TreeNode deserializeWalk(Scanner scanner){
        if(!scanner.hasNextLine()){
            return null;
        }
        String cVal=scanner.nextLine();
        if("#".equals(cVal)){
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(cVal));
        node.left=deserializeWalk(scanner);
        node.right=deserializeWalk(scanner);
        return node;
    }
}