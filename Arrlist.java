import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> listOfArrays = new ArrayList<ArrayList<Integer>>();
    Scanner sc = new Scanner(System.in);
    // System.out.print("Enter ammount of lines: ");
    int n = sc.nextInt();//nr of lines
    for(int i = 0; i<n; i++){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // System.out.print("enter ammount of integers: ");
        int d = sc.nextInt();
        for(int j = 0;j<d;j++){
            int a = sc.nextInt();
            list.add(a);
        }
        listOfArrays.add(list);
    }
    // System.out.print("Enter ammount of queries: ");
    int q = sc.nextInt();
    for(int k = 0; k<q; k++){
        int x, y;
        // System.out.print("Enter x position: ");
        x = sc.nextInt();
        // System.out.print("Enter y position: ");
        y = sc.nextInt();
        try{
           System.out.println(listOfArrays.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
    }
    sc.close();
    }
}
