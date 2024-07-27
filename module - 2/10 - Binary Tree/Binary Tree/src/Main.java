import usr.collections.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);
        bt.insert(60);
        bt.insert(70);
        bt.insert(80);


        bt.display();

        bt.delete(10);
        bt.display();
    }
}