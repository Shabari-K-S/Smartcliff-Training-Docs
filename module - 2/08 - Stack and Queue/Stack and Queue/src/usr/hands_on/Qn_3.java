package usr.hands_on;

import usr.collections.QueueADT;

public class Qn_3 {
    public static void reverse(QueueADT<Integer> q) {
        if (q.isEmpty()) return;
        int val = q.dequeue();
        reverse(q);
        q.enqueue(val);
    }

    public static void main(String[] args) {
        QueueADT<Integer> q = new QueueADT<>();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        reverse(q);
        System.out.println("Reversed Queue: " + q);
    }
}