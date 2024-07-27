package usr.mainpkg;

import usr.collections.BST;

public class BSTOperations {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        bst.insert(10);

        bst.display();

        System.out.println("Removed 20");
        bst.delete(20);
        bst.display();

        System.out.println("Removed 10");
        bst.delete(10);
        bst.display();


        System.out.println("Removed 50");
        bst.delete(50);
        bst.display();

        BST<Integer> bst1 = new BST<>();
        bst1.insert(50);
        bst1.insert(30);
        bst1.insert(70);
        bst1.insert(20);
        bst1.insert(40);
        bst1.insert(60);
        bst1.insert(80);
        bst1.insert(10);

        System.out.print("\nIn-Order: ");
        bst1.getInOrder();
        System.out.print("\nPre-Order: ");
        bst1.getPreOrder();
        System.out.print("\nPost-Order: ");
        bst1.getPostOrder();

        System.out.println();
        System.out.println(bst1.contains(20));
        System.out.println(bst1.contains(60));
        System.out.println(bst1.contains(100));

        BST<Integer> bst2 = new BST<>();
        bst2.insert(10);
        bst2.insert(20);
        bst2.insert(30);

        bst2.display();

        bst2 = bst2.balanceBST();
        bst2.display();
    }
}
