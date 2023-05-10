class Samp
{
public static void main(String args[])
{
int p,t;
float r,SI;
p=Integer.parseInt(args[0]);
t=Integer.parseInt(args[1]);
r=Float.parseFloat(args[2]);
SI=(p*t*r)/100;
System.out.println("SI:"+SI);
}
}