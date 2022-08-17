package linkedlist;

import arraylist.MyList;

public class Node {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.add(1, 2);
        ll.add(1, 3);
        ll.add(1, 4);
        ll.add(3, 8);
        ll.add(4, 10);
        ll.add(5, 15);
        ll.addLast(20);
        ll.addFirst(25);
        ll.remove(3);


        ll.printList();

    }
}
