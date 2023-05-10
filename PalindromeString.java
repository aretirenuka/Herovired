import java.util.*;
public class PalindromeString
{
public static boolean isPalindrome(String s)
{
int n=s.length();
for(int i=0;i<=n/2;i++)
{
if(s.charAt(i)!=s.charAt(n-i-1))
{
return false;
}
}
return true;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(isPalindrome(s))
{
System.out.println(s+"is palindrome string");
}
else
{
System.out.println(s+"is not palindrome");
}
}
}
