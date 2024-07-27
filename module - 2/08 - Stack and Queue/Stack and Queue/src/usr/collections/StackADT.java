package usr.collections;

import java.util.Arrays;
import java.util.Comparator;

public class StackADT<E extends Comparable<E>> {
    private E[] stack;
    private int top;
    int size = 10;

    @SuppressWarnings("unchecked")
    public StackADT() {
        stack = (E[]) new Comparable[10];
        top = -1;
    }

    @SuppressWarnings("unchecked")
    public StackADT(int size) {
        stack = (E[]) new Comparable[size];
        top = -1;
    }

    public void push(E element) {
        if (top == stack.length - 1) {
            // Resize the stack if it's full
            resizeStack();
        }
        stack[++top] = element;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        return stack[top--];
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void display() {
        System.out.println("Stack ADT:");
        for (int i = top; i >= 0; i--) {
            if (i == top) {
                System.out.println("\t" + stack[i] + " <- Peek");
            } else {
                System.out.println("\t" + stack[i]);
            }
        }
    }

    public void reverse() {
        int i = 0, j = top;
        while (i < j) {
            E temp = stack[i];
            stack[i] = stack[j];
            stack[j] = temp;
            i++;
            j--;
        }
    }

    public E getTop(){
        if (top == -1)
            return null;
        return stack[top];
    }

    public void sort() {
        Arrays.sort(stack, 0, top+1);
    }

    private void resizeStack() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    public int search(E data) {
        for(int i=0; i < top; i++ )
            if (stack[i] == data)
                return i;
        return -1;
    }

    public boolean contains(E data) {
        for(int i=0; i < top; i++ )
            if (stack[i] == data)
                return true;
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "Stack is empty";
        return Arrays.toString(Arrays.copyOfRange(stack,0,top+1));
    }

    public Object[] toArray() {
        if (isEmpty())
            return new Object[0];
        return Arrays.copyOfRange(stack,0,top+1);
    }

    public E getMin(){
        return Arrays.stream(Arrays.copyOfRange(stack,0,top+1)).min(Comparator.comparing(x -> x)).orElse(null);
    }
}