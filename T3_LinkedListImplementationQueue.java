class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Queue {

    Node head = null;
    Node tail = null;
    int size = 0;

    public void Enqueue(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;

        } else {
            tail.next = temp;

        }
        tail = temp;
        size++;
    }

    public void Dequeue() {

    }
}

public class T3_LinkedListImplementationQueue {
    public static void main(String[] args) {

    }
}
