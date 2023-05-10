import java.util.Scanner;
class Patternsnake
{
public static void printRasterForm(int arr[][],r,c)
{
for(int i=0;i<r;i++)
{
if(i%2==0)
{
for(int j=0;i<c;j++)
{
System.out.println(arr[i][j]+"");
}
}
else
{
for(int j=c-1;j>=0;j--)
{
System.out.println(arr[i][j]+"");
}
}
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int arr[]=new int[r][c];

for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
arr[i][j]=sc.nextInt();
}
}
printRasterForm(arr,r,c);
}
}