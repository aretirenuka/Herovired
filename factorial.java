import java.util.Scanner;  
class Factorial
{
public static int factorial(int m)
{
int fact=1;
for(int i=2;i<=m;i++)//formal arguments
{
fact=fact*i;
}
return fact;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt(); 
int result=factorial(n);//actual arguments
System.out.println(n);
}
}


