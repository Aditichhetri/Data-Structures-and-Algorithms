package DsaOne.Queue;

public class QueueusingArray {
    int arr[];
    int rear;
    int front;
    int size;

    QueueusingArray(int n) {
        arr = new int[n];
        front = rear = -1;
        size = 0;
    }

    int size() {
        return size;
    }

    int getRear() {
        if (size == 0)
            throw new RuntimeException("queue is empty");
        return arr[rear];
    }

    int getFront() {
        if (size == 0)
            throw new RuntimeException("queue is empty");
        return arr[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        if (size == arr.length)
            throw new RuntimeException("Cannot enqueue,queue is full");
        if (size == 0)
            front = 0;

        rear++;
        size++;
        if (rear == arr.length) {
            rear = 0;
        }

        arr[rear] = data;
    }

    int dequeue() {
        if (size == 0)
            throw new RuntimeException("Cannot dequeue,queue is empty");
        int temp = arr[front];
        front++;
        if (front == arr.length)
            front = 0;

        size--;
        if (size == 0)
            front = rear = -1;

        return temp;

    }

    void print() {
        while (!isEmpty()) {
            System.out.println(dequeue());
        }

    }

    public static void main(String[] args) {
        QueueusingArray q = new QueueusingArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.print();

    }
}
