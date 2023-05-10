import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
class FileHandling
{
    public static void main(String args[])
    {
        String arr[]={
            "hi",
            "hello",
            "etc"
        };
        try
        {
            File myObj=new File("text.txt");
            myObj.createNewFile();
            Scanner sc=new Scanner(myObj);
            while(sc.hasNextLine())
            {
                String s1=sc.nextLine();
                
                for(String s:arr)
                System.out.print(s);
                break;
            }
            sc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try{
            
            File myObj=new File("text.txt");
            myObj.createNewFile();
            FileWriter writer=new FileWriter("text.txt");
            writer.write("This is  test string");
            
            writer.close();
        }catch(Exception e)
        {
            System.out.println("printStackTrace");
        }
    }
}
    

