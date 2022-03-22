package offer.q06;

import java.util.ArrayList;

/**
 * @author HP
 * @date 2022/3/11
 */
public class ReverseLinkedlist {

    public static int[] reversePrint(ListNode head) {

/*        if(head.next == null){
            int[] temp = new int[0];
            return temp;
        }

        ArrayList<Integer> result = new ArrayList<>();
        ListNode listNode = new ListNode();
        while(head.next != null){
            ListNode temp = head.next;
            head.next = temp.next;
            temp.next = listNode.next;
            listNode.next = temp;
        }

        while (listNode.next != null){
            int temp = listNode.next.val;
            result.add(temp);
            listNode = listNode.next;
        }


        int n = result.size();
        int[] last_result = new int[n];
        for(int i=0; i<n; i++){
            last_result[i] = result.get(i);
        }

        return last_result;
    */
        /*题目头节点也存数*/
        ListNode p = head;
        int len = 0;
        while (p != null) {
            len++;
            p = p.next;
        }

        int[] result = new int[len];

        ListNode headNode = new ListNode();
        while (head != null) {
            ListNode temp = head;
            head = temp.next;
            temp.next = headNode.next;
            headNode.next = temp;
        }

        for (int i = 0; i < len; i++) {
            result[i] = headNode.next.val;
            headNode = headNode.next;
        }
        return result;
    }
}
