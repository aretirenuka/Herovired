import java.util.*;
class Bill
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int unit;
double amount,surcharge,total;
unit=sc.nextInt();
if(unit<=50)
{
amount=unit*0.5;
System.out.println(amount);
}
else if(unit<=150)
{
amount=25+(unit-50)*0.75;
System.out.println(amount);
}
else if(unit<=250)
{
amount=100+(unit-150)*1.2;
System.out.println(amount);
}
else
{
amount=220+(unit-250)*1.5;
surcharge=amount*(20/100);
total=amount+surcharge;
System.out.println(amount);
System.out.println(surcharge);
System.out.println(total);
}
}
}



 