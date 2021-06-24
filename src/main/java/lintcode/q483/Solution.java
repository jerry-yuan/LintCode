package lintcode.q483;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> toArrayList(ListNode head) {
        // write your code here
        List<Integer> integers=new LinkedList<>();
        while (head!=null){
            integers.add(head.val);
            head=head.next;
        }
        return integers;
    }
}
