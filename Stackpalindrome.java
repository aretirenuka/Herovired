import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.Stack;
class Stackpalindrome
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character>stack=new Stack<Character>();
        
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        String s1="";
        while(!stack.isEmpty())
        {
            s1+=stack.pop();
        }       
        if(s.equals(s1))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}