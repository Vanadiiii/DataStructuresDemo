package me.imatveev.arrays;

public interface Array {
    boolean add(int value);

    int indexOf(int key);

    boolean contains(int key);

    boolean delete(int key);

    void show();

    int size();
}
