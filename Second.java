
import java.util.*;
import java.util.Scanner;
public class Second {
    
    public static void main(String args[])
    {
        
        for(int i=2;i<=500;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;                    
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}

