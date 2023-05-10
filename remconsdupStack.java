class remconsdupStack
{
public static String removeConsecutiveDuplicates(String str)
{
Stack<Character>s=new Stack<>();
for(int i=0;i<str.length();i++)
{
if(s.empty()||s.peek()!=str.charAt(i))
s.push(str.charAt(i));
}
String result="";
int n=s.size();
for(int i=0;i<n;i++)
result=s.pop()+result;
return result;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
System.out.println(removeConsecutiveDuplicates(str));
}
}
