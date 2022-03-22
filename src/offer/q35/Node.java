package offer.q35;

/**
 * @author HP
 * @date 2022/3/12
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(){
        this.next = null;
        this.random = null;
    }
}
