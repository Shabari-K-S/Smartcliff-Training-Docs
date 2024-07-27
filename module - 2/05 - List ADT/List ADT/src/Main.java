
import user.collection.ArrayListADT;
import user.collection.LinkedListADT;

public class Main {
    public static void main(String[] args) {
        LinkedListADT<String> list = new LinkedListADT<>();
        list.add("Shabari");
        list.add("Ranjith");
        list.add("Sandy");
        list.add("Bala");
        list.add("Gokul", 3);
        list.add("Vijay");
        list.add("Sathis");
        list.display();
        System.out.println(list.size());
        list.remove();
        list.remove(3);
        list.display();
//        System.out.println(list.size());
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        list.display();
//        System.out.println(list.isEmpty());
//        System.out.println(list.getSimpleClassName());
//        System.out.println(list.contains(list.getFirst()));
    }
}