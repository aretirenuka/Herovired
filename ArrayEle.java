import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class ArrayEle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arrNum[] = {23, 21, 44, 32, 12};
        Arrays.sort(arrNum);
        for(int i=0;i<arrNum.length;i++)
        {
            System.out.print(arrNum[i]+" ");
        }
        System.out.println();
        for(int i=arrNum.length-1;i>=0;i--)
        {
            System.out.print(arrNum[i]+" ");
        }
    }
}