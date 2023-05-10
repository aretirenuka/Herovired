import java.util.Scanner;
class Arm
{
public static boolean isArmstrong(int n)
{
int d=(int)Math.log10(n)+1;
int sum=0,r,temp=n;
while(n>0)
{
r=n%10;
sum=sum+(int)Math.pow(r,d);
n=n/10;
}
if(sum==temp)
return true;
else
return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(isArmstrong(n))
System.out.println(n+"is armstrong number");
else
System.out.println(n+"is not armstrong number");
}
}
 



