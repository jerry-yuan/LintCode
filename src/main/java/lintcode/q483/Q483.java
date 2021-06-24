package lintcode.q483;

import utils.LinkUtil;

import static utils.JSONUtil.print;

public class Q483 {
    private static class LinkFactory implements LinkUtil.LinkNodeFactory<ListNode,Integer>{

        @Override
        public ListNode factory(Integer value) {
            return new ListNode(value);
        }

        @Override
        public ListNode getNext(ListNode node) {
            return node.next;
        }

        @Override
        public void setNext(ListNode node, ListNode next) {
            node.next=next;
        }

        @Override
        public void setValue(ListNode node, Integer value) {
            node.val=value;
        }
    }
    public static void main(String[] args) {
        print(new Solution().toArrayList(LinkUtil.deserializeAsIntegerLinkedList(new int[]{1,2,3},new LinkFactory())));
        print(new Solution().toArrayList(LinkUtil.deserializeAsIntegerLinkedList(new int[]{3,5,8},new LinkFactory())));
    }
}
