import java.util.*;
import java.util.Scanner;
import java.io.*;
class Treenode
{
    static class Node{
        int value;
        Node left,right;
        Node(int val)
        {
            this.value=val;
        }
    }
    public static void main(String args[])
    {
        Node root = new Node(1);
        addNode(2, root, 'L','L');
        addNode(3, root, 'R','R');
        addNode(6, root, 'L','L');
        addNode(7, root, 'L','R');
        inOrder(root);

    }
    public static void preOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.value+" ");
            System.out.println(root.left);
            System.out.println(root.right);

        }
    } 
    public static void postOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.left);
            System.out.println(root.value+" ");
            System.out.println(root.right);

        }
    }
    public static void inOrder(Node root)
    {
        if(root!=null)
        {
            System.out.println(root.left);
            System.out.println(root.right);
            System.out.println(root.value+" ");
        }
    }
    public static void addNode(int value,Node root,char dir1,char dir2)
    {
        Node temp=root;
        if(dir1=='L')
        {
            while(temp.left!=null)
            {
                temp=temp.left;
            }
        }
        else{
            while(temp.right!=null)
            {
                temp=temp.right;
            }
        }
        if(dir2=='L')
        {
            temp.left=new Node(value);
        }
        else
        {
            temp.right=new Node(value);
        }
    }
}