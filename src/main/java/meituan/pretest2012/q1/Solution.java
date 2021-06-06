package meituan.pretest2012.q1;

import java.util.Stack;

public class Solution {
    public ListNode reverseK(ListNode root,int k){
        Stack<ListNode> stack=new Stack<>();
        ListNode pHead=new ListNode();
        ListNode pCurrent=pHead;
        while(root!=null){
            if(stack.size()<k){
                stack.push(root);
                root=root.next;
            }else{
                while(!stack.isEmpty()){
                    pCurrent.next=stack.pop();
                    pCurrent=pCurrent.next;
                }
                pCurrent.next=null;
            }
        }
        while(!stack.isEmpty()){
            pCurrent.next=stack.pop();
            pCurrent=pCurrent.next;
        }
        pCurrent.next=null;
        return pHead.next;
    }
}
