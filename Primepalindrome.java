mport java.util.Scanner;
class PrimePalindrome
{
    public static boolean isPrimePalindrome(int n)
    {
        while(n>0)
        {
            if(n/(int)Math.pow(10,d)!=n%10)
            {
                found=1;
                break;
            }
            n=n%(int)Math.pow(10,d);
            n=n/10;
            d=d-2;
        }
        if(found==1)
        return false;
        else 
        return true;
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
            return true;
        }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       n=Math.abs(n);
       if(n%2==0)
       n=n+1;
       else
       n=n+2;
       for(int i=n;;i=i+2)
       {
           if((isPrime(i))&&(isPrimePalindrome(i)))
           System.out.println(i);
       
       else
           System.out.println(1);
       }
    
}
}
           