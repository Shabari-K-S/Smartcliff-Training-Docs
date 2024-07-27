import user.collection.DoublyLinkedListADT;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedListADT<Integer> list = new DoublyLinkedListADT<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(3,3);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);
        list.add(8,8);
        list.add(11);
        list.add(12);
        list.display();
        list.remove(8);
        list.display();
        list.remove(0);
        list.display();
        list.reverse();
        list.display();
        list.sort();
        list.display();
        DoublyLinkedListADT<Integer> list2 = new DoublyLinkedListADT<>();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(13);
//        list.merge(list2);
//        list.display();
//        System.out.println(list.search(10));
//        list.display();
//        list.removeVal(1);
        DoublyLinkedListADT<Integer> list3 = new DoublyLinkedListADT<>();
        list3.union(list,list2);
        list3.display();
        DoublyLinkedListADT<Integer> list4 = new DoublyLinkedListADT<>();
    }
}