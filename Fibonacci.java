import java.util.*;
import java.util.Scanner;
public class Fibonacci 
{
    public static int fibonaci(int n)
    {
        int f1=0,f2=1,f3=0;
        while(f3<n)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");            
        }
        return f3;       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonaci(n);
        
    }
}
