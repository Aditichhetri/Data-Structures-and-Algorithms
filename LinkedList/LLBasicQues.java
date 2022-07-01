package DsaOne.LinkedList;
public class LLBasicQues {
   
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void reverseLL(Node head){
        if(head==null){
        System.out.println("List is Empty!");
        return;}
        if(head.next==null){
            System.out.println("List contains only 1 node!");
            return;}
        Node current=head,previous=null;
       while(current!=null){
        Node next=head.next;
       current.next=previous;
       previous=next;
       }
       previous=head;
    }
    
    void findkthfromend(Node head,int k){
        Node p=head,q=head;
        for(int i=1;i<=k;i++){
            q=q.next;
        }
        while(q!=null){
            p=p.next;
            q=q.next;
        }
        System.out.println(p.data);
    }
    void midElement(Node head){
        
        Node first=head,last=head;
        while(last.next!=null){
            first=first.next;
            last=last.next.next;
        }
        System.out.println("Mid element is: "+first.data);
    }
    public boolean hasCycle(Node head) {
        
        Node fast=head,slow=head;
        if(head==null){
            return false;
        }
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

    
    
    public static void main(String[] args) {
        Node n1=new Node(100);
        Node n2=new Node(101);
        Node n3=new Node(102);
        Node n4=new Node(103);
        Node n5=new Node(104);
        // Node n6=new Node(109);
        // Node n7=new Node(111);
        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n3;
        // n5.next=n6;
        // n6.next=n7;
 
        LLBasicQues lb=new LLBasicQues();
        // lb.midElement(head);
        // int k=3;
        // lb.findkthfromend(head,k);
        // lb.reverseLL(head);
      System.out.println(lb.hasCycle(head));  
    }
   

}
