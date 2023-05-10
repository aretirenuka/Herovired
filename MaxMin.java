import java.util.Scanner;
import java.util.*;
class MaxMin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[],i,n;
n=sc.nextInt();
arr=new int[n];
int max=arr[0];
int min=arr[0];
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
for(i=0;i<n;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
else if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println(max);
System.out.println(min);
}
}



