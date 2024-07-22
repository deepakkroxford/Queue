package ProblemOnQueue;

import java.util.LinkedList;
import java.util.Queue;

class Compute {

    public long[] printFirstNegativeInteger(long arr[], int N, int K) {

        // using brute force method we can easily find the first Negative integer in
        // each window
        /*
         * Time complexity is O(n^2)
         * 
         */
        long ans[] = new long[N - K + 1];
        int j = 0;
        for (int i = 0; i <= arr.length - K; i++) {
            ans[j] = 0;
            for (int x = i; x < K + i; x++) {
                if (arr[x] < 0) {
                    ans[j] = arr[x];
                    break;
                }
            }
            j++;
        }
        return ans;
    }

    public long[] printFirstNegativeIntegerOn(long arr[], int N, int K) {

        long res[] = new long[N - K + 1];
        Queue <Integer> q = new LinkedList<>();

        //we add the index of the negative number in the queue
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                q.add(i);
            }
        }

        for(int i=0;i<N-K+1;i++)
        {
                if(q.size()>0 && q.peek()<i)
                {
                    q.remove();
                }

                if(q.size()>0 && q.peek()<=i+K-1)
                {
                    res[i]=arr[q.peek()];

                }
                else if(q.size()==0)
                {
                    res[i]=0;
                }
                else
                {
                    res[i]=0;
                }
        }

        return res;
    }

}

public class Q5_NegativeIneverWindowsizeK {
    public static void main(String[] args) {
        /*
         * Given an array A[] of size N and a positive integer K, find the first
         * negative integer for each and every window(contiguous subarray) of size K.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input :
         * N = 5
         * A[] = {-8, 2, 3, -6, 10}
         * K = 2
         * Output :
         * -8 0 -6 -6
         * Explanation :
         * First negative integer for each window of size k
         * {-8, 2} = -8
         * {2, 3} = 0 (does not contain a negative integer)
         * {3, -6} = -6
         * {-6, 10} = -6
         * 
         * Example 2:
         * Input :
         * N = 8
         * A[] = {12, -1, -7, 8, -15, 30, 16, 28}
         * K = 3
         * Output :
         * -1 -1 -7 -15 -15 0
         * 
         * 
         * Your Task:
         * You don't need to read input or print anything. Your task is to complete the
         * function printFirstNegativeInteger() which takes the array A[], its size N
         * and an integer K as inputs and returns the first negative number in every
         * window of size K starting from the first till the end. If a window does not
         * contain a negative integer , then return 0 for that window.
         * 
         * 
         * Expected Time Complexity: O(N)
         * Expected Auxiliary Space: O(K)
         * 
         * Constraints:
         * 1 <= N <= 105
         * -105 <= A[i] <= 105
         * 1 <= K <= N
         */
        Compute ans = new Compute();
        long arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = arr.length;
        int k = 3;
        long res[] = ans.printFirstNegativeInteger(arr, n, k);

        for (long l : res) {
            System.out.print(" " + l);
        }
            System.out.println();
        long sol[] = ans.printFirstNegativeIntegerOn(arr, n, k);
        for (long l : sol) {
            System.out.print(" " +l);
        }

    }
}

