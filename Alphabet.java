import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
ch=sc.nextLine().charAt(0);
if(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')
System.out.println("vowel");
else
System.out.println("consonant");
sc.close();
}
}
