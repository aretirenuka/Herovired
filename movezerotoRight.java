import java.util.Scanner;
class movezerotoRight{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0;
        n=sc.nextInt();
         x=new int[n];//memory allocation
        for(int i=0;i<n;i++)
        x[i]=sc.nextInt();//reading elements into array
        for(int i=0;i<n;i++)
        {
            if(x[i]==0)
            count++;
            else
            System.out.print(x[i]+" ");
        }
        while(count-->0)
        System.out.print(0+" ");
    }
}