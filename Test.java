import java.util.*;
import java.util.Scanner;
public class Threading
{
    public static class Test extends Thread
    {
        public void run()
        {
            System.out.print("Hi");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        t.start();
    }
}
