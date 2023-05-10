import java.util.*;
import java.math.*;
class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,result;
char operator;
a=sc.nextInt();
b=sc.nextInt();
operator=sc.next().charAt(0);
switch(operator)
{
case '+':
result=a+b;
System.out.println(result);
break;
case '-':
result=a-b;
System.out.println(result);
break;
case '*':
result=a*b;
System.out.println(result);
break;
case '/':
result=a/b;
System.out.println(result);
break;
case '%':
result=a%b;
System.out.println(result);
break;
default:
System.out.println("none");
break;
}
}
}

