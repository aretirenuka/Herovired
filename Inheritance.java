import java.util.*;
import java.util.Scanner;
class A
{
    int test=0;
}
class B extends A
{
    int test1=0;
}
public class Inheritance
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        B b=new B();
        System.out.println(b.test);
        System.out.println(b.test1);
    }
}