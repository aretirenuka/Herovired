import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class StringPalindrome
{
    public static boolean isPalin(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(n-(i+1)))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println(isPalin("MOM"));
        ;
    }
}