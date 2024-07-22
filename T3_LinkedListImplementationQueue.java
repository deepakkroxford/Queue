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
        if (head == null) {
            System.out.print("queue is empty");
            return;
        } else {
            Node temp = head;
            head = temp.next;
            temp = null;
            size--;
        }
    }

    public void Peak() {
        if(head==null)
        {
            System.out.println("invalid");
        }
        else
        {
            System.out.println(head.data);
        }
    }

    public void size() {
        if(head==null)
        {
            System.out.println("invalid");
        }
        else{
            System.out.println(size);
        }
       
    }

    public void display() {
        if(head==null)
        {
            System.out.println("invalid queue is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->" );
            temp = temp.next;
        }
        System.out.println();

    }
}

public class T3_LinkedListImplementationQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.Enqueue(3);
        queue.Enqueue(121);
        queue.Enqueue(89);
        queue.Enqueue(93);
        queue.display();
        queue.size();
        queue.Dequeue();
        queue.display();
        queue.size();
        // System.out.println(queue.Peak());
        // queue.Dequeue();
   
    }
}
