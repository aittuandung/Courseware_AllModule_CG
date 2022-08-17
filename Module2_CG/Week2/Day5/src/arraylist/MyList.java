package arraylist;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int MyList(int capacity) {
        return capacity;
    }

    public void add(int index, E element) {
        
    }

    public E remove(int index) {
        return (E) elements[index];
    }

    public int size() {
        return 0;
    }

    public E clone() {
        return (E) elements;
    }

    public boolean contains(E o) {
        return true;
    }

    public int indexOf(E o) {
        return 0;
    }

    public boolean add(E o) {
        return true;
    }

    public void ensureCapacity(int minCapatity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {

    }
}
