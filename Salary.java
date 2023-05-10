import java.util.Scanner;
class Salary
{
public static void main(String args[])
{
float salary,hra,da,gross;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Basic Salary Of Employee: ");
salary=sc.nextFloat();
if(salary<=10000)
{
da=salary*20/100;
hra=salary*80/100;
gross=salary+da+hra;
System.out.println("the da basic salary"+da);
System.out.println("the hra basic salary"+hra);
System.out.println("the gross salary"+gross);
}
else if(salary<=20000)
{
da=salary*25/100;
hra=salary*90/100;
gross=salary+da+hra;
System.out.println("the da basic salary"+da);
System.out.println("the hra basic salary"+hra);
System.out.println("the gross salary"+gross);
}
else if(salary>20000)
{
da=salary*30/100;
hra=salary*95/100;
gross=salary+da+hra;
System.out.println("the da basic salary"+da);
System.out.println("the hra basic salary"+hra);
System.out.println("the gross salary"+gross);
}
else
{
System.out.println("no");
}
}
}