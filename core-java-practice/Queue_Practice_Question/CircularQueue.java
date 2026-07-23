public class CircularQueue {

    int[] queue;
    int front;
    int count;

    CircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        count = 0;
    }

    boolean enqueue(int value) {

        if (count == queue.length) {
            System.out.println("Queue is Full");
            return false;
        }

        int rear = (front + count) % queue.length;
        queue[rear] = value;
        count++;
        return true;
    }

    int dequeue() {

        if (count == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        count--;

        return value;
    }

    void display() {

        for (int i = 0; i < count; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed : " + q.dequeue());

        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        q.display();
    }
}