import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Carchoice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    float x1,x2,x3,x4,x,y;
		     x1=sc.nextInt();
		    x2=sc.nextInt();
		     x3=sc.nextInt();	
			 x4=sc.nextInt();
			 x=x3/x1;
			 y=x4/x2;
			if(x<y)
			System.out.println(-1);
			else if(x>y)
			System.out.println(1);
			else
			System.out.println(0);
			}
	}
}
