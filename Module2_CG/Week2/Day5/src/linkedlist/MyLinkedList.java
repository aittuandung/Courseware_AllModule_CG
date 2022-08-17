package linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        if (index >= 0 && index <= numNodes) {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        } else {
            System.out.println("index khong hop le: " + index);
        }
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;
            for (int i = 0; i < numNodes && temp.next != null; i++) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        numNodes++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public boolean contains(Object o) {
        boolean check = false;
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data).equals(o)) {
                check = true;
                break;
            } else {
                temp = temp.next;
            }
        }
        return check;
    }

    public int indexOf(Object o) {
        Node temp = head;
        int count = -1;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data).equals(o)) {
                count = i;
                return count;
            } else {
                temp = temp.next;
            }
        }
        return count;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
