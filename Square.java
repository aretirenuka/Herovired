import java.util.*;
import java.lang.Math;
class Product
{
public static void main(String args[])
{
int product=1;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
product=product*(int)Math.pow(i,2);
}
System.out.println(product);
sc.close();
}
}