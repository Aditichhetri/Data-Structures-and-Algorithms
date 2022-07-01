package DsaOne.LinkedList;

public class CRUDOperations {
    private int size;
   CRUDOperations(){
    this.size=0;
    }
    Node head;
    public class Node{
        String data;
        Node next;
        Node (String data){
        this.data=data;
        this.next=null;
        size++;
        }
       }
    
    //add-first
    public void addFirst(String data){
        Node newNode=new Node(data) ;
        if(head==null){
          head=newNode;
          return;
        }
        newNode.next=head;
        head=newNode;
    }
    // add-last
    public void addLast(String data){
        Node newNode=new Node(data) ;
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null)
        { currentNode=currentNode.next;}
            currentNode.next=newNode;
        
    }

    // add-apecific
    public void addSpecific(int position,String data){
        Node currNode=head;
        for(int i=0;i<position-1;i++){
            currNode=currNode.next;
        }
        Node newNode=new Node(data);
       newNode.next= currNode.next;
       currNode.next=newNode;

    }
// delete
    public void delete(int position){
      size--;
        if(position==0){
            head=head.next;
            return;
        }
       
        Node prev=head;
        for(int i=0;i<position-1;i++)
        prev=prev.next;
        prev.next=prev.next.next;
    }
    
    // print
    public void printList(){
        if(head==null){
           System.out.println("Empty List");
           return;
        }
        Node currentNode=head;
        while(currentNode!=null)
        { 
            
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        System.out.println("NULL");
    
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
    CRUDOperations list=new CRUDOperations();
   
       list.addFirst("a");
      list.addFirst("is");
       list.addFirst("This");
       list.printList();
      list.addLast("List");
         list.printList();
      list.delete(3);
      list.printList();
       list.addSpecific(1,"Hello" );
      list.printList();
       list.delete(0);
       list.printList();
       System.out.println(list.getSize());
      
     
    }
    
}

