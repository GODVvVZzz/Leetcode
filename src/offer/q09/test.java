package offer.q09;

/**
 * @author HP
 * @date 2022/3/10
 */
public class test {

    public static void main(String[] args) {
        CQueue q = new CQueue();
        int a1 = q.deleteHead();
        System.out.println(a1);
        q.appendTail(5);
        q.appendTail(2);
        int a2 = q.deleteHead();
        System.out.println(a2);
        int a3 = q.deleteHead();
        System.out.println(a3);
    }


}
