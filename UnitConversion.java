import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class UnitConversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char choice;
        do{
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("CM to M");
            System.out.println("M to KM");
            System.out.println("KM to M");
            System.out.println("M to CM");
            
            System.out.println("Enter your menu");
            int menu=sc.nextInt();
            switch(menu)
            {
                case 1:
                System.out.print("Please enter CM value: ");
                double cm=sc.nextDouble();
                double m=cm/100;
                System.out.printf("%.2fcm=%.2fm",cm,m);
                break;
                case 2:
                System.out.printf("Please enter the M Value: ");
                double m1=sc.nextDouble();
                double km=m1/1000;
                System.out.printf("%.2fm1=%.2fkm",m1,km);
                break;
                case 3:
                System.out.printf("Please enter the KM Value: ");
                double km1=sc.nextDouble();
                double m2=1000*km1;
                System.out.printf("%.2fkm1=%.2fm2",km1,m2);
                break;
                case 4:
                System.out.printf("Please enter M value:");
                double m3=sc.nextDouble();
                double cm1=100*m3;
                System.out.printf("%.2fm3=%.2fcm1",m3,cm1);
                default:
                System.out.printf("Invalid menu choice");
                break;
            }
            System.out.println("  Do you want to Continue:(y/n)");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
    }
}