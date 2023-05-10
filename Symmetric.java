import java.util.*;
import java.util.Scanner;
class Symmetric
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int found=0;
int x[][]=new int[n][n];
int i,j,r;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
x[i][j]=sc.nextInt();
}
}
for(i=1;i<n;i++)
{
for(j=0;j<i;j++)
{
if(x[i][j]!=x[j][i])
{
found=1;
break;
}
}
}
if(found==1)
{
System.out.println("Not a Symmetric");
}
else
{
System.out.println("Symmetric");
}
}
}


