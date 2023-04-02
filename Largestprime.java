import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Largestprime
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arrNum[] = {2, 29, 51, 8, 4};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arrNum.length;i++)
        {
            if(isPrime(arrNum[i])==true)
            {
                if(arrNum[i]>max)
                {
                    max=arrNum[i];
                }
            }
        }
        if(max!=Integer.MIN_VALUE)
        {
            System.out.println("The Largest Prime number in given array:"+max );
        }
    }
}

