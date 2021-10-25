package me.imatveev.alghoritmes.impl;

import me.imatveev.alghoritmes.SortAlgorithm;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {
    @Override
    public T[] sort(T[] array) {
        for (int out = array.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in].compareTo(array[in + 1]) > 0) {
                    swap(array, in, in + 1);
                }
            }
        }

        return array;
    }

    private void swap(T[] array, int idx1, int idx2) {
        T swap = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = swap;
    }
}
