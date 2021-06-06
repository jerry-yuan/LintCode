package lintcode.q96;

import static utils.JSONUtil.print;

public class Q96 {
    public static void main(String[] args) {
        ListNode pHead;
        ListNode pCurrent;
        pHead = new ListNode(1);
        pCurrent = pHead;

        pCurrent.next=new ListNode(4);
        pCurrent=pCurrent.next;
        pCurrent.next=new ListNode(3);
        pCurrent=pCurrent.next;
        pCurrent.next=new ListNode(2);
        pCurrent=pCurrent.next;
        pCurrent.next=new ListNode(5);
        pCurrent=pCurrent.next;
        pCurrent.next=new ListNode(2);
        print(new Solution().partition(pHead,3));
    }
}
