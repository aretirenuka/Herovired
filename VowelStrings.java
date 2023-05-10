import java.util.*;
public class VowelStrings
{
public static boolean isVowelString(String s1)
{
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
ch=Character.toLowerCase(ch);
if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
{
return true;
}
}
return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1;
s1=sc.nextLine(); 
if(isVowelString(s1))
{
System.out.println(s1+" "+"vowel in string");
}
else
{
System.out.println(s1+" "+"no vowel in string");
}
}
}

