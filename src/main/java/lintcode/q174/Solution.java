package lintcode.q174;

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode fakeNode=new ListNode(-1);
        fakeNode.next=head;
        ListNode target=fakeNode;
        for (int i = 0; i < n-1; i++) {
            head=head.next;
        }
        while(head!=null){
            head=head.next;
            target=target.next;
        }
        target.next=target.next.next;
        return fakeNode.next;
    }
}