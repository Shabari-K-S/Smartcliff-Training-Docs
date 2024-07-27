package usr.hands_on;

import usr.collections.QueueADT;

public class Qn_2 {
    static QueueADT<Integer> q = new QueueADT<>();
    static QueueADT<Integer> q2 = new QueueADT<>();

    public static void push(int val) {
        if (q.isEmpty())
            q.enqueue(val);
        else {
            int qSize = q.size();
            for(int i = 0; i < qSize; i++) {
                q2.enqueue(q.dequeue());
            }
            q.enqueue(val);
            for(int i = 0; i < qSize; i++) {
                q.enqueue(q2.dequeue());
            }
        }
    }

    public static int pop() {
        int val = q.dequeue();
        return val;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        System.out.println(pop());
        System.out.println("Stack: " + q.toString());
    }
}
