package me.imatveev.arrays.impl;

public class OrdArray extends AbstractArray {
    public OrdArray() {
        super();
    }

    public OrdArray(int dataSize) {
        super(dataSize);
    }

    @Override
    @SuppressWarnings("all")
    public boolean add(int value) {
        if (size == data.length) {
            return false;
        }

        int index = 0;
        for (; index < size; index++) {
            if (data[index] >= value) {
                break;
            }
        }

        for (int i = index; i < size - 2; i++) {
            data[i + 1] = data[i];
        }

        data[index] = value;

        size++;

        return true;
    }

    /**
     * <h2>binary searching</h2>
     */
    @Override
    public int indexOf(int key) {
        int leftBound = 0;
        int rightBound = size - 1;

        while (true) {
            int index = (leftBound + rightBound) / 2;
            if (data[index] == key) {
                return index;
            } else if (leftBound > rightBound) {
                return -1;
            } else {
                if (data[index] > key) {
                    rightBound = index - 1;
                } else {
                    leftBound = index + 1;
                }
            }
        }
    }
}
