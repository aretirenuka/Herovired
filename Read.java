import java.util.Scanner;
class Read
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int empid;
String empname;
float empsal;
char empgen;
long empphon;
String empdesg;
System.out.println("enter empid,empname,empsal,empgen,empphon,empdesg");
empid=sc.nextInt();
sc.nextLine();
empname=sc.nextLine();
empsal=sc.nextFloat();
empgen=sc.next().charAt(0);
empphon=sc.nextLong();
sc.nextLine();
empdesg=sc.nextLine();
System.out.println(empid+" "+empname+" "+empsal+" "+empgen+" "+empphon+" "+empdesg);
}
}



