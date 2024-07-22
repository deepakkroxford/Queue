import java.util.Scanner;

public class T2_Array_Implementaion_queue {

    class Queue {
        int arr[] = new int[10];
        int rear = 0;
        int front = 0;
        int size = 0;

        public void Enqueue(int x) {
            if (size ==arr.length) {
                System.out.println("queue is full");
            } else {
                arr[rear] = x;
                rear= (rear+1)%arr.length;
                size++;
            }
        }

        public int Dequeue() {
            if (size==0) {
                return -1;
            }
            int value = arr[front];
            front=(front+1)%arr.length;
            size--;
            return value;

        }

        public int Peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1; // Or some other error value
            } else {
                return arr[front];
            }
        }

        public int Size() {
          
            return size;
            
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
        
            int i = front;
            int count = 0;
            while (count < size) {
                System.out.print(arr[i] + " ");
                i = (i + 1) % arr.length; // Wrap around
                count++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        T2_Array_Implementaion_queue arrayQueue = new T2_Array_Implementaion_queue();
        Queue queue = arrayQueue.new Queue();
        queue.Enqueue(1);
        queue.Enqueue(12);
        queue.Enqueue(123);
        queue.Enqueue(231);
        queue.Enqueue(23);

        queue.display();

        //it will remove the first element from the queue
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();
        queue.display();

       //this will create issue so we have to use the empty space
       
        queue.Enqueue(34);
        queue.Enqueue(34);
        queue.Enqueue(34);
        queue.Enqueue(34);
        queue.Enqueue(3);
        queue.display();
        
        System.out.println("the size of queue is "+queue.size);

    }
}
