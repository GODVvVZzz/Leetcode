package offer.q52;

import offer.q24.ListNode;

/**
 * @author HP
 * @date 2022/3/24
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A = headA;
        ListNode B = headB;
        while (A != B){
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next;
        }

        return A;
    }
}
