import java.util.*;
import java.io.*;
import java.lang.Math;
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
        Test t=new Test();
        t.start();
    }
}
