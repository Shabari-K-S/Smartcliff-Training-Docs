package user.collection;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListADT<T extends Comparable<T>> {
    private Node<T> head;

    public CircularLinkedListADT() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

//     insertion of the Node
//    **************************************

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node<T> current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            current.next = newNode;
        }
    }

    public void add(T data, int index) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        }
        if (index == 0) {
            newNode.next = head;
            Node<T> current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            head = newNode;
        } else {
            Node<T> current = head;
            for (int i = 1; current.next != head && i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

//    **************************************


//    Displaying the list
    public void display() {
        Node<T> current = head;
        System.out.print("Head -> ");
        while (current.next != head) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println(current.data + " -> Head");
    }

    public int size() {
        Node<T> current = head;
        int size = 0;
        while (current.next != head) {
            current = current.next;
            size++;
        }
        return size+1;
    }

//    removing the node
//    ********************************************

    public T remove() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> current = head;
            while (current.next.next != head) {
                current = current.next;
            }
            T data = current.next.data;
            current.next = head;
            return data;
        }
    }

    public T remove(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index == 0) {
            Node<T> current = head;
            head = head.next;
            Node<T> temp = head;
            while (temp.next != current) {
                temp = temp.next;
            }
            temp.next = head;
            return current.data;
        }
        else {
            Node<T> current = head;
            Node<T> prev = head;
            for (int i = 1; current.next != head && i < index; i++) {
                prev = current;
                current = current.next;
            }
            T data = current.data;
            prev.next = current.next;
            return data;
        }
    }

//    *********************************************

//    Searching
    public int indexOf(T data) {
        Node<T> current = head;
        int count = 0;
        while (current.next != head) {
            if (current.data.equals(data)) {
                return count;
            }
            count++;
            current = current.next;
        }
        return -1;
    }


//    reversing the list
    public void reverse()
    {
        if (head == null)
            return;
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;
        head = prev;
    }

//    Sorting
    public void swap(Node<T> ptr1, Node<T> ptr2 ) {
        T tmp = ptr1.data;
        ptr1.data = ptr2.data;
        ptr2.data = tmp;
    }
    public void sort() {
        boolean swapped;
        do {
            swapped = false;
            Node<T> current = head;
            while (current.next != head) {
                if (current.data.compareTo(current.next.data) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }


//    merge
    public void merge(CircularLinkedListADT<T> other) {
        Node<T> current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = other.head;
        current = other.head;
        while (current.next != other.head) {
            current= current.next;
        }
        current.next = head;
    }

//    Contains
    public boolean contains(T data) {
        Node<T> current = head;
        while (current.next != head) {
            if (current.data.compareTo(data) == 0) {
                return true;
            }
        }
        return false;
    }

}
