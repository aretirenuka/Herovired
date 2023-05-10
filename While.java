import java.util.*;
import java.util.Scanner;
import java.lang.Math;
class While
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(i!=78)
        {
            int random=Math.random()*(100-1+1)+1;
            random=(int)random;
            i=random;
        }
        System.out.print(Math.random());
    }
}