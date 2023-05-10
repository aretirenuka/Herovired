public class Singlelinked {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,1};
        Node c=create(a);
        printing(c);
        Node ae=addatend(c,0);
        printing(ae);
        Node as=addatstart(ae,0);
        printing(as);
      
        difference(as);
       
    }
    public static Node create(int[] a){
        Node nod=new Node(0);
        Node temp=nod;
        for(int i=0; i<a.length; i++){
            Node temp_node=new Node(a[i]);
            temp.next=temp_node;
            temp=temp.next;
        }
        temp.next=null;
        return nod.next;
    }
    public static Node addatend(Node c,int value){
        Node tempp=c;
        while(tempp.next!=null){
            tempp=tempp.next;
        }
        Node n=new Node(value);
        tempp.next=n;
        return c;
    }
    public static void printing(Node nodee){
        Node t=nodee;
        while(t!=null){
            System.out.print(t.val+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static Node addatstart(Node nodee,int value){
        Node ae=new Node(value);
        ae.next=nodee;
        return ae;
    }
    public static Node delval(Node nodee,int value){
        Node temp=nodee;
        while(temp.next.val!=value){
                temp=temp.next;
        }
        temp.next=temp.next.next;
        return nodee;
    }
public static void difference(Node n){
    Node temp=n;
    int odd=0,even=0;
    while(temp!=null){
           if(temp.val%2==0){
            even+=temp.val;
           }
           else{
            odd+=temp.val;
           }
           temp=temp.next;
    }
    System.out.println("\nDifference= "+(even-odd));
}
    public static Node reverse(Node n){
        Node temp=null;
        while(n!=null){
            if(temp==null){
                Node aa=new Node(n.val);
                temp=aa;
                temp.next=null;
            }
            else{
                temp=addatstart(temp,n.val);
            }
         n=n.next;
        }
        return temp;
    }

}