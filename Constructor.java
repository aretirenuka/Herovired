import java.util.*;
import java.util.Scanner;
public class Constructor {
	int l,b,h,area,vol;
	//default constructor
	public Box()
	{
		l=1;
		b=1;
		h=1;
	}
	//parameterized constructor with one argument
	public Box(int p)
	{
		l=p;
		b=p;
		h=p;
	}
	public Box(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	public void cal_Area()
	{
		area=l*b;
	}
	public void cal_Volume()
	{
		volume=l*b*h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Box b1=new Box();
       b1.cal_Area();
       b1.cal_Volume();
       System.out.println(b1.cal_Area+" "+b1.cal_Volume);//1 1-->because default constructor
       
       Box b2=new Box();
       b2.cal_Area();
       b2.cal_Volume();
       System.out.println(b2.cal_Area+" "+b2.cal_Volume);
       
       Box b3=new Box();
       b3.cal_Area();
       b3.cal_Volume();
       System.out.println(b3.cal_Area+" "+b3.cal_Volume);
	}
}