package ProblemOnQueue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> st = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while (st.size() != 0) {
            temp.push(st.pop());
        }
        int ele = temp.pop();
        while (temp.size() != 0) {
            st.push(temp.pop());
        }
        return ele;
    }

    public int peek() {
        Stack<Integer> temp1 = new Stack<>();
        while (st.size() != 0) {
            temp1.push(st.pop());
        }
        int peek = temp1.peek();
        while (temp1.size() != 0) {
            st.push(temp1.pop());
        }
        return peek;
    }

    public boolean empty() {
        if (st.size() == 0) {
            return true;
        }
        return false;
    }
}

public class Q4_Queue_Using_Stack {
    public static void main(String[] args) {
        /* */
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Peek: " + queue.peek()); // Should print 1
        System.out.println("Pop: " + queue.pop()); // Should print 1
        System.out.println("Pop: " + queue.pop()); // Should print 2
        System.out.println("Peek: " + queue.peek()); // Should print 3
        System.out.println("Empty: " + queue.empty()); // Should print false
        System.out.println("Pop: " + queue.pop()); // Should print 3
        System.out.println("Empty: " + queue.empty()); // Should print true
    }
}
