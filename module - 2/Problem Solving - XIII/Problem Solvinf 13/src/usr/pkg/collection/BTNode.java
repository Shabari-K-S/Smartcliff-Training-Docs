package usr.pkg.collection;

public class BTNode <E extends Comparable<E>> {
    public E data;
    public BTNode<E> left;
    public BTNode<E> right;

    public BTNode(E data) {
        this.data = data;
        left = null;
        right = null;
    }
}
