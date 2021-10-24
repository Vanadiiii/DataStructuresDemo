package me.imatveev.arrays.impl;

import me.imatveev.arrays.Array;

public abstract class AbstractArray implements Array {
    private static final int DEFAULT_DATA_SIZE = 1000;
    protected final int[] data;
    protected int size;

    protected AbstractArray() {
        this.data = new int[DEFAULT_DATA_SIZE];
        this.size = 0;
    }

    protected AbstractArray(int dataSize) {
        this.data = new int[dataSize];
        this.size = 0;
    }

    @Override
    public final int size() {
        return size;
    }

    @Override
    public final boolean contains(int key) {
        return indexOf(key) != -1;
    }

    @Override
    @SuppressWarnings("all")
    public boolean delete(int key) {
        int index = indexOf(key);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;

        return true;
    }

    @Override
    public final void show() {
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
}
