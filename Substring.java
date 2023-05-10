import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Substring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="Mangalyaan";
        int i=0,n=5;
        String s1="";
        s1=s.substring(i,n+1);
        System.out.println("subString of Mangalyaan from 0 to 5 is:" +s1);
    }
}
