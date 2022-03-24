package offer.q25;

import offer.q24.ListNode;

/**
 * @author HP
 * @date 2022/3/24
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode p;
        if(l1.val < l2.val){
            p = l1;
            l1 = l1.next;
        }else{
            p = l2;
            l2 = l2.next;
        }
        ListNode res = p;

        ListNode temp;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp = l1;
                l1 = l1.next;
            }else {
                temp = l2;
                l2 = l2.next;
            }
            p.next = temp;
            temp.next = null;
            p = temp;
        }

        if(l1 != null){
            p.next = l1;
        }
        if(l2 != null){
            p.next = l2;
        }

        return res;
    }
}
