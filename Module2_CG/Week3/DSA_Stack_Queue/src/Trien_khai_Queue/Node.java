package Trien_khai_Queue;

public class Node {
    private int key;
    private Node next;

    public Node(){}

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getKey() {
        return key;
    }

    public Node getNext() {
        return next;
    }
}
