import java.util.*;
import java.util.Scanner;
class Subsets
{
    public static int subset(String s,String s1=" ",int i=0)
    {
        if(i==s.length())
        {
            System.out.print(s1);
            return ;
        }
        subset(s,s1,i+1);
        subset(s,s1+s[i],i+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            System.out.print(subset(s,s1,i));
        }
    }
}
