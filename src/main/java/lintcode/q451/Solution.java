package lintcode.q451;

import java.util.Stack;

public class Solution {
    /**
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
        ListNode fakeHead=new ListNode(-1);
        ListNode pNode=fakeHead;
        Stack<ListNode> stack=new Stack<>();
        while(head!=null){
            if(stack.size()<2){
                stack.push(head);
                head=head.next;
            }else{
                while(!stack.isEmpty()){
                    pNode.next=stack.pop();
                    pNode=pNode.next;
                }
            }
        }
        while(!stack.isEmpty()){
            pNode.next=stack.pop();
            pNode=pNode.next;
        }
        return fakeHead.next;
    }
}
