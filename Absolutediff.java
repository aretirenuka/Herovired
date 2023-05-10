import java.util.*;
import java.util.Scanner;
class Absolutediff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int prod=1,sum=0,diff;
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
//if(ch>='0'&&ch<='9')
if(Character.isDigit(ch))
{
prod=prod*(ch-'0');
sum=sum+(ch-'0');
}
}
System.out.println(Math.abs(prod-sum));

}
}


