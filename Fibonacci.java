import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=0,n2=1,n,count=0;
n=sc.nextInt();
System.out.println(n1+" "+n2);
for(i=2;i<n;i++)
{
n=n1+n2;
n1=n2;
n2=n;
count++;

System.out.println(n+" ");


}
}
}

 

 
