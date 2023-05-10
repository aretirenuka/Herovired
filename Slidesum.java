import java.util.ArrayList;
import java.util.Scanner;
public class Slidesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> ar1=new ArrayList<>();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		
		ArrayList<Integer> ar=new ArrayList<>();
		int c=0;
		for(int i=0;i<k;i++) {
			ar.add(arr[i]);
			c+=arr[i];
		}
		ar1.add(c);
		
		int j=k;
		while(j<n) {
			ar.add(arr[j]);
			c+=arr[j];
			c-=ar.get(0);
			ar.remove(0);
			ar1.add(c);
			j++;
		}
		System.out.println(ar1);
		
	}

}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int []arr={2,3,8,9,17,16};
        int k=3;
        ArrayList<Integer> queue=new ArrayList<Integer>();
        for(int i=0;i<arr.length-k+1;i++){
            int c=0;
            for(int j=i;j<i+k;j++){
                c+=arr[j];
            }
            push(c,queue);
        }
        printQueue(queue);
    }
     public static void push(int value,ArrayList<Integer> queue){
        queue.add(value);
    }
    public static void printQueue(ArrayList<Integer> queue){
        for(int e:queue){
            System.out.print(e+" ");
        }
        System.out.print("\n");
    }
}