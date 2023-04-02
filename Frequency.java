import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arrSuperSet[] = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int arrSubSet[] = {1, 2, 3, 5, 9};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arrSuperSet.length;i++)
        {
            if(hs.containsKey(arrSuperSet[i]))
            {
                hs.put(arrSuperSet[i],hs.get(arrSuperSet[i])+1);
            }
            else
            {
                hs.put(arrSuperSet[i],1);
            }
        }
        for(int i=0;i<arrSubSet.length;i++)
        {
            if(hs.containsKey(arrSubSet[i]))
            {
                System.out.println("Frequency of 2: "+hs.get(arrSuperSet[i]));
                
            }
            else
            {
                System.out.println("Frequency of 2: "+0);
            }
        }
    }
}
