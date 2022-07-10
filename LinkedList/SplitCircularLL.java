package DsaOne.LinkedList;

public class SplitCircularLL {
    Node head;
    static Node head1;
    static Node head2;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void splitInTwoHalf() {
        Node slow = head, fast = head;
        if (head == null) {
            return;
        }

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;

        }
        // For even nodes
        if (fast.next.next == head) {
            fast = fast.next;
        }
        head1 = head;
        if (head.next != head) {
            head2 = slow.next;
        }
        fast.next = slow.next;
        slow.next = head;
    }

    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
       
    }

    public static void main(String[] args) {
        SplitCircularLL split = new SplitCircularLL();
        split.head=new Node(1);
        split.head.next=new Node(2);
        split.head.next.next=new Node(3);
        split.head.next.next.next=new Node(4);
        split.head.next.next.next.next=new Node(5);
        split.head.next.next.next.next.next=split.head;
        split.splitInTwoHalf();
        System.out.println("First Half");
        split.printList(head1);
        System.out.println("");
        System.out.println("Second Half");
        split.printList(head2);

    }

}
