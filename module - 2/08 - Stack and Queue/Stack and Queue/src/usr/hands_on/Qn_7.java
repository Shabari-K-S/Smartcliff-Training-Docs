package usr.hands_on;

import usr.collections.StackADT;


public class Qn_7 {
    static StackADT<Integer> s1 = new StackADT<>();
    static StackADT<Integer> s2 = new StackADT<>();

    public static void enqueue(int val) {
        if (s1.isEmpty())
            s1.push(val);
        else {
            int s1size = s1.size();
            for( int i=0; i<s1size; i++ ) {
                s2.push(s1.pop());
            }
            s1.push(val);
            for ( int i=0; i<s1size; i++ ) {
                s1.push(s2.pop());
            }
        }
    }

    public static int dequeue() {
        int val = s1.pop();
        return val;
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        System.out.println(dequeue());
        System.out.println(s1);

    }
}
