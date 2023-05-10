import java.util.*;
class Multiple
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
for(i=1;i<=4;i=i+4)
{
if(n%4==0)
{
System.out.println(n);
}
}
}
}

