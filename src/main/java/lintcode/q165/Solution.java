package lintcode.q165;

public class Solution {
    /**
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head=new ListNode(-1);
        ListNode pCurrent=head;
        ListNode pTemp;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                pTemp=l1;
                l1=l1.next;
                pCurrent.next=pTemp;
                pCurrent=pTemp;
            }else{
                pTemp=l2;
                l2=l2.next;
                pCurrent.next=pTemp;
                pCurrent=pTemp;
            }
        }
        if(l1!=null){
            pCurrent.next=l1;
        }else if(l2!=null){
            pCurrent.next=l2;
        }
        return head.next;
    }
}
