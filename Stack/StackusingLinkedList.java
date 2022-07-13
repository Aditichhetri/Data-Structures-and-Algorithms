package DsaOne.Stack;

public class StackusingLinkedList {
    Node head;
    int size = 0;

    public StackusingLinkedList() {
        head = null;
        size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void push(int k) {
        Node temp = new Node(k);
        if (isEmpty()) {
            head = temp;
            return;
        }
        temp.next = head;
        size++;
        head = temp;
    }

    int pop() throws Exception {
        if (head == null) {
            throw new Exception("Stack empty");
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;

    }

    boolean isEmpty() {
        return head == null;
    }

    int peek() throws Exception {
        if (head == null) {
            throw new Exception("Stack empty");
        }
        return head.data;

    }

    int size() {
        return size;
    }

    public static void main(String[] args) throws Exception {
        StackusingLinkedList s = new StackusingLinkedList();
        s.push(46);
        s.push(22);
        s.push(71);
        s.push(43);
        s.push(58);
        // System.out.println(s.peek());
        // System.out.println(s.isEmpty());
        // s.pop();
        // System.out.println(s.peek());
        // System.out.println(s.size());
        while(!s.isEmpty()){
            System.out.print(s.peek()+" "); 
            s.pop();
        }

    }
}
