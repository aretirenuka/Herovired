import java.util.Scanner;
class Line
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
String name;
age=sc.nextInt();
sc.nextLine();
name=sc.nextLine();
System.out.println("my age is"+age+"and name is"+name);
}
}