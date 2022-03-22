package offer.q24;

import java.util.List;

/**
 * @author HP
 * @date 2022/3/14
 */
public class Solution {
    public static ListNode reverseList(ListNode head) {

        /*if(head == null){
            return null;
        }

        ListNode p = new ListNode(head.val);
        ListNode cur = head;

        while (cur != null){
            cur = cur.next;
            head.next = p.next;
            p.next = head;
            head = cur;
        }

        return p.next;*/

        //递归

        if(head == null || head.next == null){
            return head;
        }

        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return node;

    }
}
