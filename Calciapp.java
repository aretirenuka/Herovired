import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Calciapp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        try
        {
            System.out.println("Choose an operation:");
            System.out.println("1.Addition:");
            System.out.println("2.Subtraction:");
            System.out.println("3.Multiplication");
            System.out.println("4.division:");
            System.out.println("5.Percentage:");
            System.out.println("6.Factorial:");
            System.out.println("7.Square:");
            System.out.println("8.Cube:");
            System.out.println("9.Square Root:");
            System.out.println("10.a Power b:");
            System.out.println("11.a Root b:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter two numbers to add");
                double n1=sc.nextDouble();
                double n2=sc.nextDouble();
                System.out.println(n1+n2);
                break;   
                       
                case 2:
                System.out.println("Enter two numbers to subtract");
                double m1=sc.nextDouble();
                double m2=sc.nextDouble();
                System.out.println(m1-m2);
                break;
                case 3:
                System.out.println("Enter two numbers to multiply");
                double h1=sc.nextDouble();
                double h2=sc.nextDouble();
                System.out.println(h1*h2);
                break;
                case 4:
                System.out.println("Enter two numbers to division");
                double k1=sc.nextDouble();
                double k2=sc.nextDouble();
                System.out.println(k1/k2);
                break;
                case 5:
                System.out.println("Enter a num and per");
                double nu=sc.nextDouble();
                double per=sc.nextDouble();
                System.out.println((nu*per)/100);
                break;
                case 6:
                System.out.println("Enter a number for fact");
                int num=sc.nextInt();
                int fact=1;
                for(int i=1;i<=num;i++)
                {
                    fact=fact*i;
                }
                System.out.println(fact);
                break;
                case 7:
                System.out.println("Enter a number for square");
                double numm=sc.nextDouble();
                System.out.println(numm*numm);
                break;
                case 8:
                System.out.println("Enter a number for cube");
                double nuum=sc.nextDouble();
                System.out.println(nuum*nuum*nuum);
                break;
                case 9:
                System.out.println("Enter a number for squareroot");
                double s=sc.nextDouble();
                System.out.println(Math.sqrt(s));
                break;
                case 10:
                System.out.println("Enter a number for power");
                double a=sc.nextDouble();
                double b=sc.nextDouble();
                System.out.println(Math.pow(a,b));
                break;
                case 11:
                System.out.println("Enter a and b numbers for Root");
                int x=sc.nextInt();
                int y=sc.nextInt();
                System.out.println(x*Math.sqrt(y));
                break;
               default:
               System.out.println("Case not found");
               break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
