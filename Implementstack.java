import java.util.Stack;
import java.util.Vector;
import java.util.*;
class Implementstack
{
    public static void main(String args[])
    {
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack.empty());
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());
        stack.clear();
        System.out.println(stack.size());
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(100);
        ar.add(200);
        ar.add(300);
        System.out.println(ar);
        stack.addAll(ar);
        
        System.out.println(stack);
    }
}
