import java.util.*;
import java.lang.*;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
class Priorityqueue
{
    public static void main(String args[])
    {
        
        PriorityBlockingQueue<String> pb=new PriorityBlockingQueue<>();
        pb.add("Clg");
        pb.add("Hlo");
        pb.add("Drive");
        pb.add("Package");
        System.out.print(pb.poll());
        System.out.print(pb.poll());
        System.out.print(pb.poll());
        System.out.print(pb.poll());        
        printBlockList(pb);
    }
   
    public static void printBlockList(PriorityBlockingQueue<String> pb)
    {
        for(String f:pb)
        {
            System.out.println(f+" ");
        }
        System.out.println();        
    }
}
