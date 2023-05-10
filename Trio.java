import java.util.*;
class Trio
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a==b&a==c)
System.out.println("Equilatorial");
else if(a==b||b==c||c==a)
System.out.println("Isosceles");
else
System.out.println("Scalene");
}
}

