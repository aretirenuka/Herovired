import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
class Queueperations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>q1=new ArrayList<Integer>();
        q1.push(4);
        q1.push(5);
        q1.push(2);
        q1.push(1);
        System.out.println(q1);
            
        q1.pop();
        q1.pop();
        q1.pop();
        System.out.println(q1);
        System.out.println(q1.isEmpty());
    }
}
