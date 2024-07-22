class CircularQueue {
    private int capacity;
    private int queue[];
    private int rear = 0;
    private int front = 0;
    private int size = 0;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
    }

    public boolean isEmpty() {
        if (size == capacity) {
            return false;
        }
        return true;
    }

    public void Enqueue(int x) throws Exception {
        if (size == capacity) {
            throw new Exception("size is full");
        } else {

            queue[rear] = x;
            rear = (rear + 1) % capacity;
            size++;
        }
    }

    public int Dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is Empty we can not delete any thing");
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public void size() {
        System.out.println("the size of queue is " + size);
    }

    public void peek() {
        System.out.println("the peek element is " + queue[front]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        int tempSize = size;
        int tempFront = front;
        while (tempSize > 0) {
            System.out.print(queue[tempFront] + " ");
            tempFront = (tempFront + 1) % capacity;
            tempSize--;
        }
        System.out.println();
    }
}

public class T4_CircularQueue {
    public static void main(String[] args) throws Exception {
        try {
            CircularQueue queue = new CircularQueue(5);

            // Enqueue elements
            queue.Enqueue(1);
            queue.Enqueue(2);
            queue.Enqueue(3);
            queue.Enqueue(4);
            queue.Enqueue(5);

            // Display the queue elements
            queue.display(); // Should print "Queue elements: 1 2 3 4 5"

            // Attempt to enqueue an element in a full queue
            queue.Enqueue(6); // Should throw "Queue is full" exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            CircularQueue queue = new CircularQueue(5);

            // Enqueue elements
            queue.Enqueue(1);
            queue.Enqueue(2);
            queue.Enqueue(3);
            queue.Enqueue(4);
            queue.Enqueue(5);

            // Peek at the front element
            queue.peek(); // Should print "The peek element is 1"

            // Dequeue elements
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 1
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 2

            // Display the queue elements
            queue.display(); // Should print "Queue elements: 3 4 5"

            // Enqueue more elements
            queue.Enqueue(6);
            queue.Enqueue(7);

            // Check the current size of the queue
            queue.size(); // Should print "The size of the queue is 5"

            // Display the queue elements
            queue.display(); // Should print "Queue elements: 3 4 5 6 7"

            // Dequeue all elements to show circular behavior
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 3
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 4
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 5
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 6
            System.out.println("Dequeued: " + queue.Dequeue()); // Should print 7

            // Display the queue elements
            queue.display(); // Should throw "Queue is empty" exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            CircularQueue queue = new CircularQueue(5);

            // Attempt to dequeue from an empty queue
            System.out.println("Dequeued: " + queue.Dequeue()); // Should throw "Queue is empty" exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}