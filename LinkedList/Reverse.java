package DsaOne.LinkedList;

public class Reverse {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Iterative Approach
    public Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
  

    void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        Reverse rev = new Reverse();
        Node n1 = new Node(15);
        Node n2 = new Node(12);
        Node n3 = new Node(17);
        Node n4 = new Node(13);
        Node n5 = new Node(12);
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        rev.printList(rev.reverseList(head));
       

    }

}
