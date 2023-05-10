import java.util.*;
class Fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibofn(n);
    }
        public void fibofn(int n)
        {
            int f1=0;f2=1;
            if(n==0)
            {
                System.out.print(f1);
            }
            else if(n==1)
            {
                System.out.print(f2);                
            }
            else if(n==2)
            {
                System.out.print("0 1");
            }
            else
            {
                for(int i=3;i<=n;i++)
                {
                    int f3=f1+f2;
                    System.out.print(f3);
                    f1=f2;
                    f2=f3;
                }
            }
        }
    }
