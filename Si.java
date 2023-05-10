class Si
{
public static void main(String args[])
{
int p=Integer.parseInt(args[0]);
int t=Integer.parseInt(args[1]);
float r=Float.parseFloat(args[2]);
float Si=(p*t*r)/100;
System.out.println("p:"+p);
System.out.println("t:"+t);
System.out.println("r:"+r);
System.out.println("Si:"+Si);
}
}