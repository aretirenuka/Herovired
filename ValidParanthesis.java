import java.io.*;
import java.util.Scanner;
class ValidParanthesis
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String>stack=new ArrayList<String>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push('(');
            }
            else if((s.charAt(i)==')')&&(stack.size()=='0'))
            {
                System.out.println("false");
            }

            else
            {
                stack.pop();
            }
        }
        System.out.println(stack.size()=='0');
    }
}
