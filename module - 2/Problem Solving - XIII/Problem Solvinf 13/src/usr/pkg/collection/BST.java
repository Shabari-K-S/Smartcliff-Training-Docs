package usr.pkg.collection;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("All")
public class BST<E extends Comparable<E>> {
    private BSTNode<E> _root;
    public BST() {
        _root = null;
    }

    public BST(E data, BSTNode<E> left, BSTNode<E> right) {
        _root = new BSTNode<>(data, left, right);
    }

    public BST(BSTNode<E> root) {
        _root = root;
    }

    public void insert(E data) {
        BSTNode<E> newNode = new BSTNode<>(data);
        if (_root == null) {
            _root = newNode;
        } else {
            BSTNode<E> current = _root;
            while (true) {
                if (current.data.compareTo(data) > 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }



    public void delete(E data) {
        this._root = _deleteNode(this._root, data);
    }

    private BSTNode<E> _deleteNode(BSTNode<E> root, E data) {
        if (root == null) {
            return null;
        }
        int compare = data.compareTo(root.data);
        if (compare < 0) {
            root.left = this._deleteNode(root.left, data);
        } else if (compare > 0) {
            root.right = this._deleteNode(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            BSTNode<E> minNodeForRight = minimumElement(root.right);
            root.data = minNodeForRight.data;
            root.right = _deleteNode(root.right, minNodeForRight.data);
        }
        return root;
    }

    private BSTNode<E> minimumElement(BSTNode<E> root) {
        if (root.left == null)
            return root;
        else {
            return minimumElement(root.left);
        }
    }

    public E getMin(){
        BSTNode<E> current = _root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public void display() {
        BSTNode<E> current = _root;
        System.out.println("Binary Search Tree: ");
        this._printTree(current, 0);
        System.out.println();
    }

    private void _printTree(BSTNode<E> node, int level) {
        if (node != null) {
            _printTree(node.right, level + 1);
            for(int i=0; i<level; i++) {
                System.out.print("\t");
            }
            System.out.println(" -> " + node.data);
            _printTree(node.left, level + 1);
        }
    }

    public void getInOrder() {
        _getInOrder(this._root);
        System.out.println();
    }

    private void _getInOrder(BSTNode<E> node) {
        if (node == null) {
            return;
        }
        _getInOrder(node.left);
        System.out.print(node.data + ", ");
        _getInOrder(node.right);
    }

    public void getPreOrder() {
        _getPreOrder(this._root);
        System.out.println();
    }

    private void _getPreOrder(BSTNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + ", ");
        _getPreOrder(node.left);
        _getPreOrder(node.right);
    }

    public void getPostOrder() {
        _getPostOrder(this._root);
        System.out.println();

    }

    private void _getPostOrder(BSTNode<E> node) {
        if (node == null) {
            return;
        }
        _getPostOrder(node.left);
        _getPostOrder(node.right);
        System.out.print(node.data + ", ");
    }

    public boolean contains(E data) {
        if (this._root != null) {
            BSTNode<E> current = _root;
            while (current != null) {
                if (current.data.compareTo(data) == 0) {
                    return true;
                } else if (current.data.compareTo(data) > 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
        }
        return false;
    }

    public BST<E> balanceBST(BSTNode<E> root) {
        // Create a list to store the inorder traversal of the BST
        List<E> inorder = new ArrayList<>();
        inorderTraversal(_root, inorder);

        // Construct and return the balanced BST
        BSTNode<E> temp = createBalancedBST(inorder, 0, inorder.size() - 1);
        return new BST<>(temp);
    }

    public void inorderTraversal(BSTNode<E> root, List<E> inorder) {
        // Perform an inorder traversal to store the elements in sorted order
        if (root == null) return;
        inorderTraversal(root.left, inorder);
        inorder.add(root.data);
        inorderTraversal(root.right, inorder);
    }

    private BSTNode<E> createBalancedBST(
            List<E> inorder,
            int start,
            int end
    ) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        BSTNode<E> leftSubtree = createBalancedBST(inorder, start, mid - 1);
        BSTNode<E> rightSubtree = createBalancedBST(inorder, mid + 1, end);
        return new BSTNode<>(
                inorder.get(mid),
                leftSubtree,
                rightSubtree
        );
    }
    public BSTNode<E> getRoot(){
        return this._root;
    }

    public boolean search(E data){
        if (this._root == null) {
            return false;
        } else {
            BSTNode<E> current = _root;
            while (current != null) {
                if (current.data.compareTo(data) == 0) {
                    this._printTree(current, 0);
                    return true;
                } else if (current.data.compareTo(data) > 0) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
        }
        return false;
    }


}

