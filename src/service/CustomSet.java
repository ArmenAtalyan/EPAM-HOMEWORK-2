package service;

public class CustomSet<T extends Comparable<T>> {

    private Node root;
    private int size;

    class Node {
        private T data;
        private Node left;
        private Node right;

        public Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node add(Node current, T item) {
        if (current == null)
            return new Node(item);
        if (current.data.compareTo(item) > 0)
            current.left = add(current.left, item);
        else if (current.data.compareTo(item) < 0)
            current.right = add(current.right, item);
        return current;
    }

    public void add(T item) {
        size++;
        root = add(root, item);
    }

    private Node remove(Node current, T item) {
        if (current == null)
            return null;
        if (item.compareTo(current.data) < 0)
            current.left = remove(current.left, item);
        else if (item.compareTo(current.data) > 0)
            current.right = remove(current.right, item);
        else {
            if (current.right == null && current.left == null)
                return null;
            else if (current.right == null || current.left == null) {
                Node temp;
                if (current.left == null)
                    temp = current.right;
                else
                    temp = current.left;
                return temp;
            } else {
                Node temp = findMinimum(current.right);
                current.data = temp.data;
                current.right = remove(current.right, temp.data);
            }
        }
        return current;
    }

    public void remove(T item) {
        size--;
        root = remove(root, item);
    }

    public Node findMinimum(Node current) {
        if (current == null)
            return null;
        else if (current.left != null)
            return findMinimum(current.left);
        return current;
    }

    private boolean contains(Node current, T item) {
        if (current == null)
            return false;
        if (current.data.compareTo(item) == 0)
            return true;
        return current.data.compareTo(item) > 0 ?
                contains(current.right, item) :
                contains(current.left, item);
    }

    public boolean containsItem(T item) {
        return contains(root, item);
    }

    public int getSize() {
        return size;
    }

    private void InOrderTraverse(Node current) {
        if (current.left != null)
            InOrderTraverse(current.left);
        System.out.println(current.data);
        if (current.right != null)
            InOrderTraverse(current.right);
    }

    public void printSet() {
        if (root != null) {
            Node node = root;
            if (node.left == null && node.right == null)
                System.out.println(node.data);
            else
                InOrderTraverse(node);
        }
    }
}
