import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class MenuDriven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char choice;
        do{
            System.out.println("Menu based app - Even/Odd Checker");
            System.out.println("Please enter the number:");
            int n=sc.nextInt();
            
            if(n%2==0)
            {
                System.out.println(n+" is an EVEN Number");
            }
            else if(n%2!=0)
            {
                System.out.println(n+" is an ODD Number");
            }
            System.out.println("\nDo you want to Continue:(y/n)");
            choice=sc.next().charAt(0);
        }while(choice=='Y'||choice=='y');
    }
}