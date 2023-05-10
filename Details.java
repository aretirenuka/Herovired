class Details
{
public static void main(String args[])
{
float sum,avg;
String name=args[0];
int rno=Integer.parseInt(args[1]);
int marks1=Integer.parseInt(args[2]);
int marks2=Integer.parseInt(args[3]);
int marks3=Integer.parseInt(args[4]);
int marks4=Integer.parseInt(args[5]);
sum=marks1+marks2+marks3+marks4;
avg=sum/4;
System.out.println("sum:"+sum);
System.out.println("avg:"+avg);
}
}

