
import java.util.*;
class wordSorting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String line=sc.nextLine();
String words[]=line.split(" ");
System.out.println("before Sorting:");
for(String word:words)
System.out.println(word+" ");
Arrays.sort(words);
System.out.println("After Sorting:");
for(String word:words)
System.out.println(word+" ");
}
}
