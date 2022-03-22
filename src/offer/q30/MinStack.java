package offer.q30;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author HP
 * @date 2022/3/11
 */
public class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> s1,s2;

    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
        if(s2.empty() || x <= s2.peek() ){
            s2.push(x);
        }
    }

    public void pop() {
        if(s1.pop().equals(s2.peek())){
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }

}
