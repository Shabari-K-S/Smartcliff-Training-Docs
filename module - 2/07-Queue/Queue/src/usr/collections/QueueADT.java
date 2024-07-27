package usr.collections;

public class QueueADT <E extends Comparable<E>> {
    private E[] queue;
    private int front, end;

    public QueueADT() {
        queue = (E[]) new Comparable[10];
        front = -1;
        end = -1;
    }

    public QueueADT(int capacity) {
        queue = (E[]) new Comparable[capacity];
        front = -1;
        end = -1;
    }

    public void enqueue(E e) {
        if (end == queue.length - 1) {
            // Queue is full, resize the array
            resizeQueue();
        }

        if (front == -1) {
            // Queue is empty
            front = 0;
        }

        queue[++end] = e;
    }

    public E dequeue() {
        if (front == -1) {
            // Queue is empty
            return null;
        }

        E item = queue[front];
        if (front == end) {
            // Only one element in the queue
            front = -1;
            end = -1;
        } else {
            front++;
        }

        return item;
    }

    public int size() {
        if (front == -1) {
            // Queue is empty
            return 0;
        }

        return end - front + 1;
    }

    private void resizeQueue() {
        E[] newQueue = (E[]) new Comparable[queue.length * 2];
        for (int i = front; i <= end; i++) {
            newQueue[i - front] = queue[i];
        }
        queue = newQueue;
        front = 0;
        end = end - front;
    }

    public void display() {
        if (front == -1) {
            // Queue is empty
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        for (int i = front; i <= end; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

