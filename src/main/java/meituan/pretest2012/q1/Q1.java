package meituan.pretest2012.q1;

public class Q1 {
    public static void main(String[] args) {
        ListNode pNode;
        ListNode pHead=new ListNode();

        pNode=pHead;

        for (int i = 0; i < 6 ; i++) {
            ListNode pTemp=new ListNode();
            pTemp.value=i+1;
            pNode.next=pTemp;
            pNode=pTemp;
        }

        pNode=new Solution().reverseK(pHead.next,4);

        while(pNode!=null){
            System.out.print(pNode.value);
            if(pNode.next!=null)
                System.out.print("->");
            pNode=pNode.next;
        }

    }
}
