import java.util.*;
import java.util.Scanner;
class Numbersum
{
    public static int numSum(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return numSum(n/10)+n%10;
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numSum(n));

    }
}