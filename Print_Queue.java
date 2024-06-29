import java.util.LinkedList;
import java.util.Queue;

public class Print_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        Queue<Integer> healper= new LinkedList<Integer>();
        while (q.size()>0) {
            System.out.println(q.peek());
            healper.add(q.poll());
        }

        while (healper.size()>0) {
            q.add(healper.poll());
        }
    }
}
