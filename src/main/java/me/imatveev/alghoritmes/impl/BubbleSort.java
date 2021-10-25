package me.imatveev.alghoritmes.impl;

import me.imatveev.alghoritmes.SortAlgorithm;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {
    @Override
    public T[] sort(T[] array) {
        boolean flag = true;
        while (flag) {
            flag = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    flag = true;

                    T swap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swap;
                }
            }
        }

        return array;
    }
}
