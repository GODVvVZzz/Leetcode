package offer.q06;

import java.util.ArrayList;

/**
 * @author HP
 * @date 2022/3/11
 */
public class test {

    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);

        head.next = node1;
        node1.next = node2;



        ReverseLinkedlist.reversePrint(head);


    }
}
