package service;

public class SetNode<T extends Comparable<T>> {

    private Node root;
    private int size;

    public SetNode(int size) {
        this.size = size;
    }

    class Node {
        private T item;
        private Node left;
        private Node right;

        public Node(T item) {
            this.item = item;
            left = null;
            right = null;
        }
    }

    private Node add(Node current, T t) {
        if (current == null)
            return new Node(t);
        if (current.item.compareTo(t) > 0)
            current.left = add(current.left, t);
        else if (current.item.compareTo(t) < 0)
            current.right = add(current.right, t);
        else
            return current;
        size++;
        return current;
    }
    public void add(T t) {
        root = add(root, t);
    }

    private Node remove(Node current, T t){
        if(current == null)
            return null;
        if(t.compareTo(current.item) == 0)
            current.item = null;
        else if(t.compareTo(current.item) < 0)
            current.left = remove(current.left, t);
        else if(t.compareTo(current.item) > 0)
            current.right = remove(current.right, t);
        size--;
        return current;
    }
    public void remove(T item){
        root = remove(root, item);
    }

    private boolean contains(Node current, T item){
        if(current == null)
            return false;
        if(root.item.compareTo(item) == 0)
            return true;
        return root.item.compareTo(item) > 0 ?
                contains(root.right, item) :
                contains(root.left, item);
    }
    public boolean contains(T item){
        return contains(root, item);
    }

    public int getSize(){
        return size;
    }
}
