
import java.util.*;
import java.util.Scanner;
class Palindrome
{
public static boolean isPalindrome(int n)
{
int d=(int)Math.log10(n);
int found=0;
while(n>9)
{
if(n/(int)Math.pow(10,d)!=n%10)
{
found=1;
break;
}
n=n%(int)Math.pow(10,d);
n=n/10;
d=d-2;
}
if(found==1)
return false;
else
return true;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(isPalindrome(n))
System.out.println("true");
else
System.out.println("false");
}
}


