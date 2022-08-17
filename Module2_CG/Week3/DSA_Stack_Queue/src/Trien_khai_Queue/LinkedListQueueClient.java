package Trien_khai_Queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MylinkedListQueue queue = new MylinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().getKey());

    }
}
