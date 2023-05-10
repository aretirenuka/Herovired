import java.util.*;
class Reverse
{
public static int reverseArray(int x[],int n)
{
int i=0,j=n-1;
while(i<j)
{
int temp;
temp=x[i];
x[i]=x[j];
x[j]=temp;
i++;
j--;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[],i,n;
n=sc.nextInt();
arr=new Int[n];
for(i=0;i<n;i++)
arr[i]=sc.nextInt();
reverseArray(arr,n);
for(int ele:arr)
System.out.println(ele+" ");
sc.close();
}
}









