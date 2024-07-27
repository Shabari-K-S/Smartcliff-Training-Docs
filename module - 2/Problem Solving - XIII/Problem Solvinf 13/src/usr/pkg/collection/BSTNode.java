package usr.pkg.collection;

public class BSTNode<E extends Comparable<E>>{
    public E data;
    public BSTNode<E> left;
    public BSTNode<E> right;

    public BSTNode(E data) {
        this.data = data;
        left = null;
        right = null;
    }


    public BSTNode(E data,BSTNode<E> left, BSTNode<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

