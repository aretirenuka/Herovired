import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arrNum[]={31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int n=arrNum.length;
        System.out.print("The elements in reverse order -");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arrNum[i]+" ");
        }
    }
}