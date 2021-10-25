package me.imatveev.alghoritmes;

public interface SortAlgorithm<T extends Comparable<T>> {
    T[] sort(T[] array);
}
