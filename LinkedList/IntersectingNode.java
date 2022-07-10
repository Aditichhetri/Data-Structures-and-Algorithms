package DsaOne.LinkedList;

public class IntersectingNode {
    Node head1, head2;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node IntersectionOfLL() {
        Node d1 = head1;
        Node d2 = head2;
        if (head1 == null || head2 == null)
            return null;

        while (d1 != d2) {
            d1 = d1 == null ? d1 = head2 : d1.next;
            d2 = d2 == null ? head1 : d2.next;

        }
        return d1;

    }

    public static void main(String[] args) {
        IntersectingNode list = new IntersectingNode();
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(8);
        list.head1.next.next.next = new Node(7);
        list.head1.next.next.next.next = new Node(6);
        // List2
        list.head2 = new Node(27);
        list.head2.next = list.head1.next.next;
       
        Node ans = list.IntersectionOfLL();
        System.out.println(ans.data);
    }

}
