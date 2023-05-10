import java.util.Scanner;
class Num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[],n;
n=sc.nextInt();
arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
System.out.println(arr[2]);
System.out.println(arr.length);
}
}



 