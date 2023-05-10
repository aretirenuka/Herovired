import java.util.*;
import java.util.Scanner;
class Pattern1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                
                System.out.print(c);
                c++;

            }
            System.out.println();
        }
    }
}