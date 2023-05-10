import java.util.*;
import java.util.Scanner;
class Sumdigits
{
public static int countofDigits(int n)
{
int count=0;
while(n>0)
{
count++;
n=n/10;
}
return count;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int result=countofDigits(n);
System.out.println(result);
}
}
 
