import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Values
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int count=arr.length;
        int min=arr[0];
        int avg,sum=0;
        for(int i=1;i<count;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];                
            }
        }
        int max=arr[0];
        for(int i=1;i<count;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<count;i++)
        {
            sum=sum+arr[i];
        }
        avg=(int)sum/count;
        System.out.println("The element with the Minimum value"+min);
        System.out.println("The element with the Maximum value:"+max);
        System.out.println("Average of all array elements:"+avg);
        System.out.println("Total number of array elements:"+count);
    }
}