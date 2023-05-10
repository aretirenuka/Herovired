import java.util.*;
import java.util.Scanner;
class Palindrome
{
    public static boolean isPalin(String s)
    {
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);           

        }
        if(s.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(isPalin(s));
    }
}