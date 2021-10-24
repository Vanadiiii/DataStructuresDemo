package me.imatveev.arrays.data.impl;

import me.imatveev.arrays.data.Data;
import me.imatveev.arrays.data.DataArray;

@SuppressWarnings("all")
public class HighDataArray<D, I> implements DataArray<D, I> {
    private static final int DEFAULT_DATA_SIZE = 1000;
    private final Data[] data;
    private int size;

    public HighDataArray() {
        this.data = new Data[DEFAULT_DATA_SIZE];
        this.size = 0;
    }

    public HighDataArray(int dataSize) {
        this.data = new Data[dataSize];
        this.size = 0;
    }

    @Override
    public boolean add(Data<I> value) {
        if (size == data.length) {
            return false;
        }

        data[size] = value;
        size++;
        return true;
    }

    @Override
    public Data<I> get(I key) {
        int index = indexOf(key);

        if (index == -1) {
            return null;
        } else {
            return data[index];
        }
    }

    @Override
    public int indexOf(I key) {
        for (int i = 0; i < size; i++) {
            if (data[i].getId().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean contains(I key) {
        return indexOf(key) != -1;
    }

    @Override
    public boolean delete(I key) {
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

    @Override
    public int size() {
        return size;
    }
}
