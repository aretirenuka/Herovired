import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
class FirstFibonaccino
{
    public static int seriesofNum(int n)
    {
        if(n==0)
        {
        return 0;
        }
        else if(n==1)
        {
        return 1;
        }
        else
        {
            return seriesofNum(n-1)+seriesofNum(n-2);
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {           
            System.out.print(seriesofNum(i)+" ");
        }
        for(int i=0;i<n;i++)
        {
            sum+=seriesofNum(i);
        }
        System.out.println("sum="+sum);

    }
}
