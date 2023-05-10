import java.util.*;
class Pair
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,j,x[],target,found=0;
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
target=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(x[i]+x[j]==target && i!=j)
{
found=1;
break;
}
}
}
if(found==1)
{
System.out.print("Yes");
}
else
{
System.out.print("No");
}
}
}


