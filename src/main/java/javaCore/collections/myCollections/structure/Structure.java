package javaCore.collections.myCollections.structure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/**
 * Структура на основе массива
 */

public class Structure<T> implements Iterable<T> {
    // Поле массив объектов
    private T[] struct;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure<?> structure = (Structure<?>) o;
        return getSize() == structure.getSize() && Arrays.equals(struct, structure.struct);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSize());
        result = 31 * result + Arrays.hashCode(struct);
        return result;
    }

    // Размер массива
    private int size;

    public void add(T o) {
        struct[size++] = o;
    }

    public T get(int index) {
        return struct[index];
    }

    public int getSize() {
        return size;
    }

    // Конструктор по умолчанию делает размер структуры 5 элементов, иначе размер массива = initialSize
    public Structure() {
        this.struct = (T[]) new Object[5];
    }

    public Structure(int initialSize) {
        this.struct = (T[]) new Object[initialSize];
    }


    @Override
    public Iterator<T> iterator() {
        return new StructureIterator();
    }

    private class StructureIterator implements Iterator<T> {

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return struct[currentIndex++];
        }
    }
}
