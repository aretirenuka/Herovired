import java.util.*;
import java.util.Scanner;
import java.io.*;
class Stringpalinfun
{
    public static boolean isPalindrome(String s,int i,int j)
    {
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        if(i<=j)
        {
            i+=1;
            j-=1;
            return true;
            
        }
        return isPalindrome(s,i,j);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,j;
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}