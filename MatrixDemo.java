import java.util.Scanner;
class MatrixDemo
{
public static String matrixSumCalculation(int m[][],int row,int col)
{
int s1=0;s2=0;
for(int i=0;i<r;i++)
{
s1+=m[i][i];
s2+=m[i][r-i-1];
}
if(s1!=s2)
{
return "NO";
}
else
{
for(int i=0;i<r;i++)
{
int s2=0;s3=0;
for(int j=0;j<c;j++)
{
s2+=m[i][j];
s3+=m[j][i];
}
if(s1!=s2||s1!=s3)
return "No";
}
}
return "Yes";

}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[][],r,c;
r=sc.nextInt();
c=sc.nextInt();
x=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
x[i][j]=sc.nextInt();
}
System.out.println(matrixSumCalculation(x,r,c));
}
}
}




