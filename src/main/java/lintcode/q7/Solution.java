package lintcode.q7;

import java.io.*;
import java.util.Base64;

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
    Base64.Encoder encoder=Base64.getEncoder();
    Base64.Decoder decoder=Base64.getDecoder();
    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        try {
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(new BTreeContainer(root));
            objectOutputStream.flush();
            objectOutputStream.close();
            return encoder.encodeToString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
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
        try {
            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(decoder.decode(data));
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
            return ((BTreeContainer)objectInputStream.readObject()).root;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }

    }
    public static class BTreeContainer implements Serializable {
        public TreeNode root;
        public BTreeContainer(TreeNode root){
            this.root=root;
        }
    }
}