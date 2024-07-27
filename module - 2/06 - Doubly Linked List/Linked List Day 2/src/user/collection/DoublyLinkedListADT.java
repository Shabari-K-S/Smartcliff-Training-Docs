package user.collection;

class Nodes<T extends Comparable<T>> {
    Nodes<T> prev;
    T data;
    Nodes<T> next;

    public Nodes(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListADT<T extends Comparable<T>> {
    Nodes<T> head;

    public DoublyLinkedListADT() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

/*    Addition of the Nodes
 *    *************************************
 */
    public void add(T data) {
        Nodes<T> newNode = new Nodes<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Nodes<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void add(T data, int index) {
        Nodes<T> newNode = new Nodes<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            if (index == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else {
                Nodes<T> temp = head;
                for (int i = 1; temp.next != null && i < index; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
            }
        }
    }


//     **************************************


/*    Deletion of the Node
 *    *************************************
 */
    public T remove() {
        if (isEmpty()) {
            return null;
        } else {
            Nodes<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
            temp.prev = null;
            return temp.data;
        }
    }

    public T remove(int index) {
        if (index == 0) {
            T val = head.data;
            head = head.next;
            head.prev = null;
            return val;
        } else {
            Nodes<T> temp = head;
            for (int i = 0; temp.next != null && i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.prev = null;
            return temp.data;
        }
    }

    public void removeVal(T data) {
        if (head == null) {
            return;
        }
        if (head.data.compareTo(data) == 0){
            head = head.next;
            head.prev = null;
        }  else {
            Nodes<T> temp = head;
            while (temp.next != null) {
                if (temp.data.compareTo(data) == 0) {
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                    break;
                }
                temp = temp.next;
            }
            if (temp.next != null) {
                if (temp.data.compareTo(data) == 0) {
                    temp.prev.next = null;
                }
            }
        }
        if (contains(data)) {
            removeVal(data);
        }
    }
//     **************************************

/*    Displaying the Doubly Linked List
*     *************************************
*/
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Nodes<T> temp = head;
            System.out.print("Head <--> ");
            while (temp != null) {
                System.out.print(temp.data + " <--> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
//     **************************************

/*    Checking for the values
 *    *************************************
 */
    public boolean contains(T data) {
        if (head == null) {
            return false;
        } else {
            Nodes<T> temp = head;
            while (temp != null) {
                if (temp.data.compareTo(data) == 0) {
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public int size() {
        if(isEmpty()) {
            return 0;
        } else {
            Nodes<T> temp = head;
            int count = 0;
            while (temp != null) {
                temp = temp.next;
                count++;
            }
            return count;
        }
    }

//    Sort Linked List
    void swap(Nodes<T> ptr1, Nodes<T> ptr2) {
        T tmp = ptr2.data;
        ptr2.data = ptr1.data;
        ptr1.data = tmp;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            Nodes<T> current = head;
            swapped = false;

            while (current != null && current.next != null) {
                if (current.data.compareTo(current.next.data) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

//    Reverse Linked List

    public void reverse() {
        Nodes<T> temp = null;
        Nodes<T> current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }


//    Merging Doubly Linked List
    public void merge(DoublyLinkedListADT<T> list2) {
        Nodes<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2.head;
        list2.head.prev = temp;
    }

    public int search(T dat) {
        Nodes<T> temp = head;
        int count = 0;
        while (temp.next != null) {
            if (temp.data.equals(dat)) {
                return count;
            }
            temp = temp.next;
            count+=1;
        }
        return -1;
    }

//    Union of List
    public void union(DoublyLinkedListADT<T> head1, DoublyLinkedListADT<T> head2) {
        Nodes<T> t1 = head1.head, t2 = head2.head;
        while (t1 != null) {
            push(t1.data);
            t1 = t1.next;
        }
        while (t2 != null) {
            if (!contains(t2.data))
                push(t2.data);
            t2 = t2.next;
        }
    }

    void push(T new_data) {
        Nodes<T> new_node = new Nodes<>(new_data);
        new_node.next = head;
        head = new_node;
    }

}

