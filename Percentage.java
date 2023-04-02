import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class Percentage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double marOb=650;
        double totMar=700;
        String grade;
        Double gpa;
        double percent=(marOb/totMar)*100;
        if(percent>90)
        {
            grade="A";
            gpa=4.0;
        }
        else if(percent>80)
        {
            grade="B";
            gpa=3.0;
        }
        else if(percent>70)
        {
            grade="C";
            gpa=2.0;
        }
        else if(percent>60)
        {
            grade="D";
            gpa=1.0;
        }
        else{
            grade="F";
            gpa=0.0;
        }
        System.out.println("percent:"+percent+" grade "+grade+" gpa="+gpa);
        

    }
}