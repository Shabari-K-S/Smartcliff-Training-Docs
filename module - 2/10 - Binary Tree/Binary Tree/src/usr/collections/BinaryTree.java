package usr.collections;

import java.util.*;

public class BinaryTree <E extends Comparable<E>> {
    private BTNode<E> _root;
    private static int size = 0;
    private static int height = 0;
    private E min;
    private E max;


    public BinaryTree() {
        _root = null;
    }

    public boolean isEmpty() {
        return _root == null;
    }

    public void insert(E data) {
        BTNode<E> newNode = new BTNode<E>(data);
        if (isEmpty()) {
            _root = newNode;
        } else {
            Queue<BTNode<E>> q = new LinkedList<>();
            q.add(_root);

            BTNode<E> curr = _root;
            while (!q.isEmpty()) {
                curr = q.peek();
                q.remove();
                if (curr.left == null) {
                    curr.left = newNode;
                    break;
                } else {
                    q.add(curr.left);
                }

                if (curr.right == null) {
                    curr.right = newNode;
                    break;
                } else {
                    q.add(curr.right);
                }
            }
        }

    }
    public void display(){
        BTNode<E> curr = _root;
        this._printTree(_root, 0);
    }

    private void _printTree(BTNode<E> root,int level) {
        if (root == null) {
            return;
        }
        _printTree(root.left, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println("-> " +root.data);
        _printTree(root.right, level + 1);
    }

    public void inorder()
    {
        _inOrder(_root);
    }

    private void _inOrder(BTNode<E> temp){
        if (temp == null)
            return;

        _inOrder(temp.left);
        System.out.print(temp.data + " ");
        _inOrder(temp.right);
    }

    public void preorder()
    {
        _preOrder(_root);
    }

    private void _preOrder(BTNode<E> temp){
        if (temp == null)
            return;

        System.out.print(temp.data + " ");
        _preOrder(temp.left);
        _preOrder(temp.right);
    }

    public void postorder()
    {
        _postOrder(_root);
    }

    private void _postOrder(BTNode<E> temp){
        if (temp == null)
            return;

        _postOrder(temp.left);
        _postOrder(temp.right);
        System.out.print(temp.data + " ");
    }

    private void deleteDeepest(BTNode<E> root, BTNode<E> delNode) {
        Queue<BTNode<E>> q = new LinkedList<>();
        q.add(root);

        BTNode<E> temp = null;

        // Do level order traversal until last node
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delNode) {
                    temp.right = null;
                    return;
                }
                else
                    q.add(temp.right);
            }

            if (temp.left != null) {
                if (temp.left == delNode) {
                    temp.left = null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }

    public void delete(E key)
    {
        BTNode<E> root = _root;
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            if (root.data == key) {
                root = null;
                return;
            }
            else
                return;
        }

        Queue<BTNode<E>> q = new LinkedList<>();
        q.add(root);
        BTNode<E> temp = null, keyNode = null;

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.data == key)
                keyNode = temp;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (keyNode != null) {
            keyNode.data = temp.data;
            deleteDeepest(root, temp);
        }
    }

    public int size() {
        BTNode<E> curr = _root;
        size = 0;
        _getSize(_root);
        return size;
    }

    private void _getSize(BTNode<E> root){
        if (root == null) return;
        _getSize(root.left);
        size+=1;
        _getSize(root.right);
    }

    public int getHeight(){
        BTNode<E> curr = _root;
        height = 0;
        _getHeight(_root, height);
        return height;
    }
    private void _getHeight(BTNode<E> root, int h){
        if (root == null) return;
        if (height < h) height = h;
        _getHeight(root.left, h + 1);
        _getHeight(root.right, h + 1);
    }

    public E min() {
        _getMin(this._root);
        return min;
    }

    private void _getMin(BTNode<E> root) {
        if (root == null) return;
        if (root == this._root) this.min = root.data;
        _getMin(root.left);
        _getMin(root.right);
        if (root.data.compareTo(this.min) < 0) {
            this.min = root.data;
        }
    }

    public E max() {
        _getMax(this._root);
        return this.max;
    }

    private void _getMax(BTNode<E> root) {
        if (root == null) return;
        if (root == this._root) this.max = root.data;
        _getMax(root.left);
        _getMax(root.right);
        if (root.data.compareTo(this.max) > 0) {
            this.max = root.data;
        }
    }

    public BTNode<E> getRoot() {
        return this._root;
    }
}
