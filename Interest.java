class Interest
{
public static void main(String args[])
{
int t,s,b,c;
t=Integer.parseInt(args[0]);
s=Integer.parseInt(args[1]);
b=Integer.parseInt(args[2]);
c=t*s*b*512;
System.out.println(c+"bytes");
System.out.println(c/1024+"KB");
System.out.println(c/(1024*1024)+"MB");
System.out.println((float)c/1024*1024*1024+"GB");
}
}

