import com.collection.CircularLinkedListADT;

public class Main {
    public static void main(String[] args) {
        CircularLinkedListADT<Integer> list = new CircularLinkedListADT<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5,5);

        list.display();
        list.remove();
        list.display();
        list.remove(5);
        list.display();
        System.out.println(list.size());
        System.out.println(list.indexOf(4));
        list.reverse();
        list.display();
        list.sort();
        list.display();
        CircularLinkedListADT<Integer> l2 = new CircularLinkedListADT<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        list.merge(l2);
        list.display();
    }
}