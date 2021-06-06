package lintcode.q112;

public class Solution {
    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode fakeNode=new ListNode(-1);
        fakeNode.next=head;
        ListNode prev=fakeNode;
        ListNode current=head;

        while(current!=null){
            if(prev.val==current.val){
                prev.next=current.next;
                current=prev.next;
            }else{
                prev=prev.next;
                current=current.next;
            }
        }
        return fakeNode.next;
    }
}
