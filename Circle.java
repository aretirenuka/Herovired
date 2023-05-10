import java.util.*;
import java.io.*;
class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        double area=3.14*r*r;
        float f=float(area);
        System.out.println(f);
    }
}