package usr.collections;

public class CircularQueueADT<E extends Comparable<E>> {
    private E[] queue;
    private int front, end, capacity;

    public CircularQueueADT() {
        this.capacity = 10;
        queue = (E[]) new Comparable[10];
        front = 0;
        end = 0;
    }

    public CircularQueueADT(int capacity) {
        this.capacity = capacity;
        queue = (E[]) new Comparable[capacity];
        front = 0;
        end = 0;
    }

    public void enqueue(E e) {
        if ((end + 1) % capacity == front) {
            // Queue is full, resize the array
            resizeQueue();
        }

        queue[end] = e;
        end = (end + 1) % capacity;
    }

    public E dequeue() {
        if (front == end) {
            // Queue is empty
            return null;
        }

        E item = queue[front];
        front = (front + 1) % capacity;
        return item;
    }

    public int size() {
        if (front == end) {
            // Queue is empty
            return 0;
        }

        return (end + capacity - front) % capacity;
    }

    public void display() {
        if (front == end) {
            // Queue is empty
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Circular Queue: ");
        for (int i = front; i != end; i = (i + 1) % capacity) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    private void resizeQueue() {
        E[] newQueue = (E[]) new Comparable[capacity * 2];
        for (int i = front; i != end; i = (i + 1) % capacity) {
            newQueue[i % newQueue.length] = queue[i];
        }
        newQueue[end % newQueue.length] = queue[end];
        queue = newQueue;
        front = 0;
        end = end % newQueue.length;
    }
}
