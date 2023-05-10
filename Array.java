import java.util.Scanner;
class Array
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        isSum(a,n);
    }
    public void isSum(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                if(a[i]+a[j]==10)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
