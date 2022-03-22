package offer.q35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author HP
 * @date 2022/3/12
 */
public class Solution {

    /*
    Map<Node,Node> map = new HashMap<>();
    //ArrayList<Node> map = new ArrayList<>();

    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }

        if(!map.containsKey(head)){
            Node headNew = new Node(head.val);
            map.put(head,headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }

        return map.get(head);
    }*/

    public Node copyRandomList(Node head) {

        if(head == null){
            return null;
        }

        Node current = head;

        //复制节点 放在后面
        while (current != null){
            Node newNode = new Node(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;
        }

        current = head;
        while (current != null){
            if(current.random != null){
                current.next.random = current.random.next;

            }
            current = current.next.next;

        }

        current = head;
        Node copyHead = head.next;
        Node cur_copy = head.next;
        while(current != null){
            current.next = current.next.next;
            current = current.next;

            if(cur_copy.next != null){
                cur_copy.next = cur_copy.next.next;
                cur_copy = cur_copy.next;
            }

        }

        return copyHead;
    }
}
