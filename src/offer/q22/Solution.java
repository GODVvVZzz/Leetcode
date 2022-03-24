package offer.q22;

import offer.q24.ListNode;

/**
 * @author HP
 * @date 2022/3/24
 */
public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode slow = head, fast = head;
        while (k > 0){
            fast = fast.next;
            k--;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
