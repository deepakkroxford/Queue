
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class CircularQueueImplementation_UsingLinkedList {
    private Node head = null;
    private Node tail = null;
    int Size = 0;

    public void Enqueue(int data) {
        Node temp = new Node(data);

        if (head == null && tail == null) {
            head = temp;
            tail = temp;
            tail.next=head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
        Size++;
    }

    public void Dequeue() throws Exception {
        if (head == null && tail == null) {
            throw new Exception("Queue is empty");
        } else {
            Node temp = head;
            head = head.next;
            tail.next = head;
            temp = null;
            Size--;
        }
    }

    public void size() {
        System.out.println("the size of queue: "+Size);
    }

    public int peek() throws Exception {
        if(head==null && tail==null)
        {
           throw new Exception("Queue is Empty ");
        }
        return head.data;
    }

    public void display() throws Exception {
        if (head == null && tail == null) {
            throw new Exception("Queue is empty");
        }
        Node temp = head;
        System.out.print("Queue elements: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

}

public class T5_CicularQueue_Linkedlist {
    public static void main(String[] args) {
        try {
            CircularQueueImplementation_UsingLinkedList queue = new CircularQueueImplementation_UsingLinkedList();

            // Enqueue elements
            queue.Enqueue(1);
            queue.Enqueue(2);
            queue.Enqueue(3);
            queue.Enqueue(4);
            queue.Enqueue(5);

            // Display the queue elements
            queue.display(); // Should print "Queue elements: 1 2 3 4 5"

            // Peek at the front element
            System.out.println("Peek element: " + queue.peek()); // Should print "Peek element: 1"

            // Check the size of the queue
            queue.size(); // Should print "The size of the queue is 5"

            // Dequeue elements
            queue.Dequeue();
            queue.Dequeue();

            // Display the queue elements
            queue.display(); // Should print "Queue elements: 3 4 5"

            // Check the size of the queue
            queue.size(); // Should print "The size of the queue is 3"

            // Peek at the front element
            System.out.println("Peek element: " + queue.peek()); // Should print "Peek element: 3"

            // Enqueue more elements
            queue.Enqueue(6);
            queue.Enqueue(7);

            // Display the queue elements
            queue.display(); // Should print "Queue elements: 3 4 5 6 7"

            // Dequeue all elements to show circular behavior
            queue.Dequeue();
            queue.Dequeue();
            queue.Dequeue();
            queue.Dequeue();
            queue.Dequeue();

            // Display the queue elements
            queue.display(); // Should throw "Queue is empty" exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            CircularQueueImplementation_UsingLinkedList queue = new CircularQueueImplementation_UsingLinkedList();

            // Attempt to dequeue from an empty queue
            queue.Dequeue(); // Should throw "Queue is empty" exception

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}