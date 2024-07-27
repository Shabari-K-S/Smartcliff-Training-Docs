import usr.collections.*;

public class Main {
    public static void main(String[] args) {
        QueueADT<Integer> queue = new QueueADT<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Queue size: " + queue.size());
        int i=0;
        while (i < 2) {
            System.out.println("Dequeued: " + queue.dequeue());
            i++;
        }
        System.out.println("Queue size: " + queue.size());
        queue.display();

        CircularQueueADT<Integer> queue2 = new CircularQueueADT<>(10);

        // Enqueue some elements
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.enqueue(4);
        queue2.enqueue(5);

        // Display the queue
        queue2.display();
        i=0;
        while (i < 2) {
            System.out.println("Dequeued: " + queue2.dequeue());
            i++;
        }
        System.out.println("Queue size: " + queue2.size());
        queue2.display();
    }
}