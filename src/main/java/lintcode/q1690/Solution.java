package lintcode.q1690;

import java.util.Arrays;

public class Solution {
    /**
     * @param val: the personality value of user
     * @return: Return their recommend friends' value
     */

    public int[] getAns(int[] val) {
        // Write your code here
        int[] output = new int[val.length - 1];
        BiDirectionalNode cursor = new BiDirectionalNode(val[0]);

        Arrays.fill(output,-1);

        for (int i = 1; i < val.length; i++) {
            BiDirectionalNode nextNode = new BiDirectionalNode(val[i]);
            while (cursor.value < nextNode.value && cursor.next != null) {
                cursor = cursor.next;
            }
            while (cursor.value > nextNode.value && cursor.prev != null) {
                cursor = cursor.prev;
            }
            // 插入
            if (cursor.value < nextNode.value) {
                cursor.appendAfter(nextNode);
            }else{
                cursor.insertBefore(nextNode);
            }

            // 检查哪个小
            long distance=Long.MAX_VALUE;
            if (nextNode.next != null){
                distance = nextNode.next.value - nextNode.value;
                output[i-1]=nextNode.next.value;
            }

            if (nextNode.prev!=null && nextNode.value - nextNode.prev.value <= distance){
                output[i-1]=nextNode.prev.value;
            }
        }
        return output;
    }

    static class BiDirectionalNode {
        BiDirectionalNode prev;
        BiDirectionalNode next;
        int value;

        public BiDirectionalNode(int value) {
            this.value = value;
        }

        public void insertBefore(BiDirectionalNode node) {
            node.next = this;
            node.prev = this.prev;
            if (this.prev != null) {
                this.prev.next = node;
            }
            this.prev = node;
        }

        public void appendAfter(BiDirectionalNode node) {
            node.prev = this;
            node.next = this.next;

            if (this.next != null) {
                this.next.prev = node;
            }
            this.next = node;
        }
    }
}
