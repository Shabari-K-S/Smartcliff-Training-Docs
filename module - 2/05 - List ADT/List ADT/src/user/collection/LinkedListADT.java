package user.collection;

class Node <T extends Comparable<T>> {
    T val;
    Node<T> next;
    public Node(T val)
    {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListADT<T extends Comparable<T>> {
    private Node<T> head;

    public LinkedListADT() {
        head = null;
    }
    public void add(T val) {
        Node<T> newNode = new Node<>(val);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void add( T data, int position) {
        System.out.println("Adding a node at the specified position " + position + " of the list with data " + data + "\n");
        Node<T> newNode = new Node<>(data);
        Node<T> current = this.head;
        Node<T> previous = this.head;
        if (position == 1) {
            newNode.next = head;
            this.head = newNode;
            return;
        }
        for( int i = 0; current.next!= null && i < position; i++) {
            previous = current;
            current = current.next;
        }
        previous.next = newNode;
        newNode.next = current;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public T getFirst() {
        return head.val;
    }

    public void display() {
        if (head != null) {
            Node<T> temp = head;
            System.out.print("Head -> ");
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        } else {
            System.out.println("LinkedListADT is empty");
        }
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> temp = head;
            head = head.next;
            return temp.val;
        }
    }
    public void remove() {
        if (isEmpty()) {
            System.out.println("LinkedListADT is empty");
        } else {
            Node<T> current = this.head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public T getLast() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp.val;
        }
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
            int cnt = 0;
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
                cnt++;
            }
            return cnt+1;
        }
    }

    public String getSimpleClassName() {
        return "UserDefined: LinkedListADT";
    }

    public void remove(int position)
    {
        System.out.println("Deleting a node from the specified position " + position +  "\n");
        if (head == null) {
            System.out.println("The given list is empty.\n");
        }
        else if(position == 0) {
            head = head.next;
        }
        else {
            Node<T> current = head;
            Node<T> prev = head;
            for(int i = 0; current.next != null && i < position; i++) {
                prev = current;
                current = current.next;
            }

            prev.next = current.next;
        }
    }
    public boolean contains(T val) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void removeValue(T val) {
        Node<T> current = head;
        Node<T> prev = head;
        if (head.val == val) {
            head = head.next;
        } else {
            while(current.next != null) {
                if(current.val == val) {
                    prev.next = current.next;
                    current.next = current.next.next;
                }
                if (current.next!= null) {
                    prev = current;
                    current = current.next ;
                }
            }
        }
        if (contains(val)) {
            removeValue(val);
        }
    }

    public int search(T val) {
        if (contains(val)) {
            int cnt = 0;
            Node<T> temp = head;
            while(temp != null) {
                if (temp.val == val) {
                    return ++cnt;
                }
                cnt++;
                temp = temp.next;
            }
        }
        return -1;
    }

    public void reverse(){
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void merge(LinkedListADT<T> ele){
        Node<T> temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = ele.head;
    }

    void swap(Node<T> ptr1, Node<T> ptr2) {
        T tmp = ptr2.val;
        ptr2.val = ptr1.val;
        ptr1.val = tmp;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            Node<T> current = head;
            swapped = false;

            while (current != null && current.next != null) {
                if (current.val.compareTo(current.next.val) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

}
