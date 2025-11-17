package org.proghax333.practice_13nov;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

class DynamicArray<T> implements Iterable<T> {
    private T[] array;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    public void add(T data) {
        if(size == capacity) {
            T[] copy = (T[]) new Object[capacity * 2];
            for(int i = 0; i < size; ++i) {
                copy[i] = array[i];
            }

            array = copy;
            capacity = capacity * 2;
        }
        array[size++] = data;
    }

    public T get(int index) {
        if(index < 0 || index >= size) {
            return null;
        }

        return array[index];
    }

    public T remove(int index) {
        if(index < 0 || index >= size) {
            return null;
        }

        T elementToRemove = array[index];

        for(int i = index; i < size - 1; ++i) {
            array[i] = array[i + 1];
        }

        size--;

        return elementToRemove;
    }

    public void sort(Comparator<T> c) {
        for(int i = 0; i < size; ++i) {
            int minIndex = i;

            for(int j = i; j < size; ++j) {
                int result = c.compare(array[minIndex], array[j]);

                if(result > 0) {
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                T temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new DynamicArrayIterator<>(size, this);
    }

    static class DynamicArrayIterator<T> implements Iterator<T> {
        int index = 0;
        int size = 0;
        DynamicArray<T> arr;

        public DynamicArrayIterator(int size, DynamicArray<T> arr) {
            this.size = size;
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            T x = arr.get(index);
            ++index;

            return x;
        }
    }
}

public class DynamicArrayListProgram {
    public static void main(String[] args) {
        DynamicArray<Integer> arr = new DynamicArray<>(3);

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        arr.remove(1);
        arr.remove(3);

        // sort in a "descending" order.
        arr.sort((a, b) -> b - a);

        for(int x : arr) {
            System.out.println(x);
        }
    }
}
