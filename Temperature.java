import java.util.*;
class Temperature
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp;
temp=sc.nextInt();
if(temp<0)
System.out.println("then Freezing weather");
else if(temp==(0-10))
System.out.println("then Very Cold weather");
else if(temp==(10-20))
System.out.println("then Cold weather");
else if(temp==(20-30))
System.out.println("then Normal in Temp");
else if(temp==(30-40))
System.out.println("then Its Hot");
else 
System.out.println("then Its Very Hot");
}
}

