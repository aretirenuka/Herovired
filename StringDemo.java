
import java.util.*;
public class StringDemo
{
public static void main(String args[])
{
String s1="Technical";
s1.concat("Hub");//string is immutable(cant change)
System.out.println(s1);
StringBuffer sb1=new StringBuffer("Technical");
sb1.append("Hub");
System.out.println(sb1); 
}
}
