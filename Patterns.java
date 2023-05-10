import java.util.*;
import java.util.Scanner;
class Patterns
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int start=n-1,end=n-1;
            for(int j=0;j<=(2*n)-1;j++)
            {
                if(i>=start&&j<=end)
                System.out.println(" ");
            }
            start-=1;
            end+=1;
            System.out.println();
        }
    }
import java.util.*;
import java.util.Scanner;
