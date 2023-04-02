import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x,y;
        try
        {
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
4)
import java.util.Scanner;
class MyCalculator extends Exception {
    
    
    long power(int n, int p) throws Exception{
        if(n==0 && p==0){
            throw new Exception("n and p should not be zero.");
        }
        else if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        
        else{
        
        return (long)Math.pow(n,p); 
        }
    }
}
