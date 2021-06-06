package lintcode.q294;

public class Solution {
    /**
     * @param head: the linked list to be simplify.
     * @return: return the linked list after simplifiction.
     */
    public ListNode simplify(ListNode head) {
        // write your code here
        ListNode originRear=head;
        int count=-1;
        while(originRear.next!=null){
            count++;
            originRear=originRear.next;
        }
        ListNode numbers=originRear;
        ListNode temp;
        while(count>0){
            temp=new ListNode(count%10+'0');
            temp.next=numbers;
            numbers=temp;
            count/=10;
        }
        head.next=numbers;
        return head;
    }
}