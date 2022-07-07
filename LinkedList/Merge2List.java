package DsaOne.LinkedList;

public class Merge2List {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node SortedMerge(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node prevNode = dummy;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                prevNode.next = head1;
                head1 = head1.next;
            }

            else {
                prevNode.next = head2;
                head2 = head2.next;
            }
            prevNode=prevNode.next;
        }
        if(head1!=null)
        prevNode.next=head1;
        if(head2!=null)
        prevNode.next=head2;

        return dummy.next;
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

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node head1 = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Node n11 = new Node(5);
        Node n21 = new Node(6);
        Node n31 = new Node(7);
        Node n41 = new Node(8);
        Node head2 = n11;
        n11.next = n21;
        n21.next = n31;
        n31.next = n41;
        Merge2List ml = new Merge2List();
        Node ans = ml.SortedMerge(head1, head2);
        System.out.println("Sorted List 1");
        ml.printList(head1);
        System.out.println("Sorted List 2");
        ml.printList(head2);
        System.out.println("Sorted Merged Lists");
        ml.printList(ans);

    }

}
