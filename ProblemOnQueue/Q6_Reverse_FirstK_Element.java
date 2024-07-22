package ProblemOnQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Q6_Reverse_FirstK_Element
 */

 class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> rev = new LinkedList<>();
         int x = k%q.size();
        
        Stack<Integer> st =new Stack<>();
        for(int i=1;i<=x;i++)
        {
            st.push(q.remove());
        }
        
        while(st.size()!=0)
        {
            rev.add(st.pop());
        }
        
        while(q.size()!=0)
        {
            rev.add(q.remove());
        }
        return rev;
       
        
        
    }
}

public class Q6_Reverse_FirstK_Element {

    public static void main(String[] args) {
        /*
         * Reverse First K elements of Queue
         * Difficulty: EasyAccuracy: 81.28%Submissions: 126K+Points: 2
         * Given an integer K and a queue of integers, we need to reverse the order of
         * the first K elements of the queue, leaving the other elements in the same
         * relative order.
         * 
         * Only following standard operations are allowed on queue.
         * 
         * enqueue(x) : Add an item x to rear of queue
         * dequeue() : Remove an item from front of queue
         * size() : Returns number of elements in queue.
         * front() : Finds front item.
         * Note: The above operations represent the general processings. In-built
         * functions of the respective languages can be used to solve the problem.
         * 
         * Example 1:
         * 
         * Input:
         * 5 3
         * 1 2 3 4 5
         * Output:
         * 3 2 1 4 5
         * Explanation:
         * After reversing the given
         * input from the 3rd position the resultant
         * output will be 3 2 1 4 5.
         * Example 2:
         * 
         * Input:
         * 4 4
         * 4 3 2 1
         * Output:
         * 1 2 3 4
         * Explanation:
         * After reversing the given
         * input from the 4th position the resultant
         * output will be 1 2 3 4.
         * Your Task:
         * Complete the provided function modifyQueue() that takes queue and K as
         * parameters and returns a modified queue. The printing is done automatically
         * by the driver code.
         * 
         * Expected Time Complexity : O(N)
         * Expected Auxiliary Space : O(K)
         */

         PriorityQueue<Integer> ans = new PriorityQueue<>();
         ans.add(12);
         ans.add(24);
         ans.add(4);
         ans.add(3);
         ans.add(78);
         System.out.println(ans);

    }
}