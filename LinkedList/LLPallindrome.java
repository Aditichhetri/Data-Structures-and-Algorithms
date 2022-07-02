package DsaOne.LinkedList;

public class LLPallindrome {
    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }
    }

    Node reverse(Node current,Node previous){
        if(current==null){
            return previous;
        }
        Node next=current.next;
       current.next=previous;
       return reverse(next, current);
    
    }
    boolean pallindrome(Node head){
        Node prev=null;
        Node slow=head,fast=head;
        Node mid=null;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(fast!=null){
        mid=slow;
        slow=slow.next;}

        Node secondHalf=slow;
        prev.next=null;
        secondHalf=reverse(secondHalf,null);
       boolean result= compare(head,secondHalf);
       secondHalf=reverse(secondHalf,null);
       if(mid!=null){
        prev.next=mid;
        mid.next=secondHalf;
       }
       return result;

    }
    boolean compare(Node a,Node b){
        while(a!=null&&b!=null){
        if(a.data==b.data){
          a=a.next;
          b=b.next;
        }
        else{
        return false;}
    }
    return true;
    }
    public static void main(String[] args) {
       
        Node n1=new Node('m');
        Node n2=new Node('a');
        Node n3=new Node('d');
        Node n4=new Node('a');
        Node n5=new Node('m');
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        LLPallindrome list=new LLPallindrome();
       boolean ans= list.pallindrome(head);
       System.out.println(ans);

    }
    
}

