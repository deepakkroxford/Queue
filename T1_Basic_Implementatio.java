import java.util.LinkedList;
import java.util.Queue;

/**
 * Basic_Implementatio
 */
public class T1_Basic_Implementatio {

    public static void main(String[] args) {
    Queue <Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(23);
    q.add(21);

    //this is used to print the size of the queue
    System.out.println(q.size());
    System.out.println(q);


    //q.poll(); // poll method is used to remove the element from the queue
    System.out.println(q);
    System.out.println(q.peek());// the peek method is use to print the first element

    //types of operation 
    /*
     * 1)add
     * 2) poll() /remove()
     * 3)peek()
     * 4)size()
     * 5)isEmpty() it return true or false
     */
        
    
    }
}