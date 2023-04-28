import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
 	  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        int countNegative = 0;
        for(int i = 0; i < n; i++) {
            int ans = 0;
            for (int j = i; j < n; j++) {
               ans += arr[j];
               if (ans < 0) {
                   countNegative++;
               }
           }
        }
        System.out.println(countNegative);
    }
}
