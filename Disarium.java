import java.util.Scanner;
class Automorphic
{
public static boolean isAutomorphic(int n)
{
int d=(int)Math.log10(n)+1;
if((n*n)%(int)Math.pow(10,d)==n)
return true;
else 
return false;
 

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(isDisarium(n))
System.out.println(n+"is disarium");
else
System.out.println(n+"is not disarium number");
}
}
 


