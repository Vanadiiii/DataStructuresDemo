package me.imatveev.arrays;

import java.util.logging.Logger;

public class ArrayD {
    private static final Logger log = Logger.getLogger(ArrayD.class.getName());

    private final int[] data;
    private int size;

    public ArrayD() {
        this.data = new int[1000];
        this.size = 0;
    }

    public ArrayD(int dataSize) {
        this.data = new int[dataSize];
        this.size = 0;
    }

    public boolean add(int value) {
        if (size == data.length) {
            log.warning("Array is full");
            return false;
        }

        data[size] = value;
        log.info("adding new value - " + value + " to index - " + size);

        size++;
        log.info("Array's size was increased to " + size);

        return true;
    }

    public boolean find(int key) {
        return findIndex(key) != -1;
    }

    @SuppressWarnings("all")
    public boolean delete(int key) {
        int index = findIndex(key);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        log.info("Element " + key + " was removed");
        log.info("Size was decreased to " + size);

        return true;
    }

    public void show() {
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    System.out.print(data[i]);
                } else {
                    System.out.print(data[i] + ", ");
                }
            }
            System.out.println("]");
        }
    }

    public int size() {
        return size;
    }

    private int findIndex(int key) {
        for (int i = 0; i < size; i++) {
            if (data[i] == key) {
                log.info("Found element " + key + " on index - " + i);
                return i;
            }
        }

        log.warning("Can't find element - " + key);
        return -1;
    }

}
