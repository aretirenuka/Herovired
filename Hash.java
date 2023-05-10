import java.util.*;
import java.util.Scanner;
class Hash
{
public static boolean findPair(int x[],int sum)
{
HashMap<Integer,Integer>hm=new HashMap<>();
for(int i=0;i<n;i++)
{
if(hm.containsKey(sum-x[i]))
{
return true;
}
else
{
hm.put(x[i],i);
}
}
return false;
}
public static void main(String args[])
{
int n,x[],sum,i,j,found=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
{
x[i]=sc.nextInt();
}
sum=sc.nextInt();
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
System.out.print(findPair(arr,sum));
}
}








