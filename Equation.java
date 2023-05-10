import java.util.*;
import java.math.*;
class Equation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double f1,f2,x;
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
x=b*b-4*a*c;
if(x<0)
{
System.out.println("roots are negative");
}
else if(x>0)
{
f1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
f2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
System.out.println("roots are distinct");
System.out.println(f1+"and"+f2);
}
else
{
System.out.println("roots are imaginary");
}
}
}




