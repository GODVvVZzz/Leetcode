package offer.q09;

import java.util.Stack;

/**
 * @author HP
 * @date 2022/3/10
 */
public class CQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;


    public CQueue() {

        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {

        if(!s2.empty()){
            return s2.pop();
        }

        if(!s1.empty()){
            while(!s1.empty()){
                int temp = s1.pop();
                s2.push(temp);
            }
            return s2.pop();
        }


        return -1;
    }

}
