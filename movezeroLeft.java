import java.util.Scanner;
class movezeroLeft
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[],n;
n=sc.nextInt();
x=new int[n];
for(int i=0;i<n;i++)
x[i]=sc.nextInt();
int j=0,found=0;
for(int i=0;i<n;i++)
if(x[i]==0)
{
j=i;
found=1;
break;
}
if(found==1)
{
for(int i=j-1 i<n-1;i--)
{
if(x[i]!=0 && i!=j)
{
 int temp=x[i];
x[i]=x[j];
x[j]=temp;
j--;
}
}
}
for(int i=0;i<n;i++)
System.out.println(x[i]+" ");
}
}