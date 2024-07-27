package problems;

import java.util.ArrayList;

class LLNode<E extends Comparable<E>> {
    E data;
    LLNode<E> next;

    public LLNode(E data, LLNode<E> next) {
        this.data = data;
        this.next = next;
    }

    public LLNode(E data) {
        this(data, null);
    }
}

class LinkedList<E extends Comparable<E>> {
    private LLNode<E> head;

    public LinkedList() {
        head = null;
    }
    public void push(E e) {
        LLNode<E> newNode = new LLNode<>(e);
        if (head == null) {
            head = newNode;
        } else {
            LLNode<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (isEmpty())
            return;
        LLNode<E> current = head;
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    @SuppressWarnings("unchecked")
    public E[] findVal(int k){
        LLNode<E> current = head;
        ArrayList<E> list = new ArrayList<>();
        while (current.next != null) {
            list.add(current.data);
            current = current.next;
        }
        int len = list.size();
        E[] arr = (E[]) new Comparable[2];
        arr[0] = list.get(k-1);
        arr[1] = list.get(len-k+1);
        return arr;
    }

    public void swapNode(int k) {
        LLNode<E> first = head;
        LLNode<E> prev = null;
        E[] data = findVal(k);
        while (first != null) {
            if (first.data.equals(data[0])) {
                break;
            }
            prev = first;
            first = first.next;

        }
        LLNode<E> second = head;
        LLNode<E> prev2 = null;
        while (second != null) {
            if (second.data.equals(data[1])) {
                break;
            }
            prev2 = second;
            second = second.next;
        }
        assert prev != null;
        assert prev2 != null;
        LLNode<E> temp = prev.next;
        prev.next = prev2.next;
        prev2.next = temp;

        assert first != null;
        assert second != null;
        temp = first.next;
        first.next = second.next;
        second.next = temp;
    }

    public ArrayList<LinkedList<E>> merge(LinkedList<E> list) {
        LLNode<E> f = head;
        LLNode<E> s = list.head;
        LinkedList<E> finalList = new LinkedList<>();
        while (f != null ) {
            finalList.push(f.data);
            f = f.next;
            if (s!=null){
                finalList.push(s.data);
                s = s.next;
            }
        }
        LinkedList<E> ni = new LinkedList<>();
        while (s != null) {
            ni.push(s.data);
            s = s.next;
        }
        System.out.println();

        ArrayList<LinkedList<E>> res = new ArrayList<>();
        res.add(finalList);
        res.add(ni);
        return res;
    }
}