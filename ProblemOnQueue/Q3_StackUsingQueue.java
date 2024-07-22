package ProblemOnQueue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();

    }

    public int top() {
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        int top = q.peek();
        q.add(q.remove());
        return top;
    }

    public boolean empty() {
        if (q.size() == 0) {
            return true;
        }
        return false;
    }
}

public class Q3_StackUsingQueue {
    public static void main(String[] args) {

    }
}
