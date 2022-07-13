package DsaOne.Stack;

public class StackusingArray {
    int arr[];
    int capacity;
    int top;

    public StackusingArray(int capacity) {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int k) throws Exception {
        if (top == capacity - 1) {// Overflow
            throw new Exception("Stack is full");
        }
        top++;
        arr[top] = k;

    }

    int pop() throws Exception {
        if (top == -1) {// Underflow
            throw new Exception("Stack is empty");
        }
        int res = arr[top];
        top--;
        return res;

    }

    int peek() throws Exception {
        if (top == -1) {
            throw new Exception("Stack is empty");
        }
        int res = arr[top];
        return res;

    }

    public static void main(String[] args) throws Exception {
        StackusingArray s=new StackusingArray(3);
        s.push(4);
        s.push(7);
        s.push(2);
        s.pop();
       System.out.println(s.peek()); 
       System.out.println( s.isEmpty());

       

    }

}
