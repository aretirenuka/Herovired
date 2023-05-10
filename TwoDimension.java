import java.util.*;
import java.util.Scanner;
class TwoDimension       
{
    public static void main(String args[])
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int[] a:arr)
        {
            for(int ele:a)
            {
                sum=sum+ele;
            }
        }
        System.out.println(sum);
    }
}