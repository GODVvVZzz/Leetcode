package offer.q18;

import offer.q24.ListNode;

/**
 * @author HP
 * @date 2022/3/21
 */
public class Solution {

    public ListNode deleteNode(ListNode head, int val) {

        if(head.val == val){
            return head.next;
        }

        ListNode pre = head, p = head.next;
        while (p != null){
            if(p.val == val){
                pre.next = p.next;
                break;
            }
            pre = p;
            p = p.next;
        }

        return head;
    }

}
