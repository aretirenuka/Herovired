import java.util.Queue;
import java.util.Vector;
import java.util.*;
class Implementqueue
{
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.remove());
    }
}
