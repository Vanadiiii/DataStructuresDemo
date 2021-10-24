package me.imatveev.arrays.impl;

public class HighArray extends AbstractArray {

    public HighArray() {
        super();
    }

    public HighArray(int dataSize) {
        super(dataSize);
    }

    @Override
    public boolean add(int value) {
        if (size == data.length) {
            return false;
        }

        data[size] = value;
        size++;
        return true;
    }

    /**
     * <h2>linear searching</h2>
     */
    @Override
    public int indexOf(int key) {
        for (int i = 0; i < size; i++) {
            if (data[i] == key) {
                return i;
            }
        }

        return -1;
    }

}
