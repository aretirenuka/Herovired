import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class EndOnes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arrNum[] = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int n=arrNum.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arrNum[i]!=1)
            {
                arrNum[c]=arrNum[i];
                c++;
            }
        }
        while(c<n)
        {
            arrNum[c]=1;
            c++;
        }
        System.out.println(" Array elements after moving Ones to end:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arrNum[i]+" ");
        }
    }
}
