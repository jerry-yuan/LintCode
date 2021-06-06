package lintcode.q96;

public class Solution {
    /**
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if(head == null){
            return null;
        }
        ListNode pFakeHead= new ListNode(-1);
        pFakeHead.next=head;
        ListNode pCurrent = pFakeHead;

        ListNode pHead = new ListNode(-1);
        ListNode pSmallerCurrent=pHead;

        ListNode pTemp;

        while(pCurrent.next!=null){
            if(pCurrent.next.val<x){
                pTemp = pCurrent.next;
                pCurrent.next=pTemp.next;

                pSmallerCurrent.next=pTemp;
                pTemp.next = null;
                pSmallerCurrent=pSmallerCurrent.next;
            }else {
                pCurrent = pCurrent.next;
            }
        }
        pSmallerCurrent.next=pFakeHead.next;
        return pHead.next;
    }

    public void dump(ListNode node){
        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }
}