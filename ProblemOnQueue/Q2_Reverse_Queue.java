package ProblemOnQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q2_Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(34);
        queue.add(78);
        queue.add(78);
        queue.add(233);
        System.out.println(queue);

        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()) {
            st.add(queue.poll());
        }

        while (!st.isEmpty()) {
            queue.add(st.pop());
        }
        System.out.println(queue);
    }
}
