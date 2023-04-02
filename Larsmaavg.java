import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Larsmaavg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=10;
        int num2=20;
        int num3=30;
        int avg=0;
        int lar=num1;
        if(lar<num2)
        {
            lar=num2;
        }
        if(lar<num3)
        {
            lar=num3;
        }
        System.out.println(lar+" ");
        int smal=num1;
        if(smal>num2)
        {
            smal=num2;
        }
        if(smal>num3)
        {
            smal=num3;
        }
        System.out.println(smal+" ");
        avg=(num1+num2+num3)/3;
        System.out.println(avg);
    }

}
