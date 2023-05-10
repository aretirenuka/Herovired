import java.util.*;
import java.util.Scanner;
class Divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num>10)&&(num<100)&&(num%5==0))
        {
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
}