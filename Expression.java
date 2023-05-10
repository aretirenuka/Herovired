import java.util.*;
import java.lang.Math;
class Expression
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int n=sc.nextInt();
double sum=0;
if(x==0)
{
System.out.println(1);
System.exit(0);
}
for(int i=0;i<=n;i++)
{
sum=sum+1/Math.pow(x,i);
}
System.out.println(sum);
}
}

  