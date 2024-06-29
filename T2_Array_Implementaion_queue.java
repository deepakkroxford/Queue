
public class T2_Array_Implementaion_queue {

    class Queue {
        int arr[] = new int[10];
        int rear = 0;
        int front = 0;
        int size = 0;

        public void Enqueue(int x) {
            if (rear == arr.length - 1) {
                System.out.println("queue is full");
            } else {
                arr[rear] = x;
                rear++;
                size++;
            }
        }

        public int Dequeue() {
            if (rear == front) {
                return -1;
            }
            front++;
            size--;
            return arr[front - 1];

        }

        public int Peek() {
            return arr[front];
        }

        public int Size() {
            return size;
        }

        public void display() {
            for (int i = front; i < rear; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        T2_Array_Implementaion_queue arrayQueue = new T2_Array_Implementaion_queue();
        Queue queue = arrayQueue.new Queue();
        queue.Enqueue(1);
        queue.Enqueue(12);
        queue.Enqueue(123);
        queue.display();

        //it will remove the first element from the queue
        queue.Dequeue();
        queue.display();
        
        System.out.println("the size of queue is "+queue.size);

    }
}
