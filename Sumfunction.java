import java.util.*;
import java.util.Scanner;
class Sumfunction
{
    public static int sum(int n)
    {
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else
        return n+sum(n-1);
        
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(sum(n));
    }
}

  