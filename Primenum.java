import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Primenum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=23;
        int f=0;
        for(int i=1;i*i<=num;i++)
        {
            if(num%i!=0)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.println("The given number "+num+" is a Prime number");
        }
        else
        {
            System.out.println("The given number "+num+" is NOT a Prime number.");
        }
    }
}