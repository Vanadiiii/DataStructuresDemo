package me.imatveev.arrays.data;

public interface DataArray<D, I> {
    boolean add(Data<I> value);

    Data<I> get(I key);

    int indexOf(I key);

    boolean contains(I key);

    boolean delete(I key);

    void show();

    int size();
}
