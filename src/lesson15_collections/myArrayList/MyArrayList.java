package lesson15_collections.myArrayList;
// изначально выделить capacity а в size() записывать сколько непосредственно элементов добавлено в ArrayList
// если capacity 100, то size ->100 (80) он срочно не позволяя дойти до грани расширяемого массива выделяет еще память
// с запасом (изначальная память * 1.2)
// + getFirst() , getLast()

public class MyArrayList<T> {
    private T [] array;

    private int size;
    private int capacity;



    public MyArrayList() {
        this.array = (T[]) new Object[3];
    }

    public MyArrayList(int arrayLength) {
        this.array = (T[]) new Object[arrayLength];
        this.capacity = arrayLength;
    }

    public void add(T obj) {
        if (size >= array.length) {
            int newCapacity = array.length * 3 / 2 + 1;
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            this.capacity = newCapacity;
        }

        array[size++] = obj;
    }

    public void remove(int index) {
        while (index < size) {
            array[index] = array[index++];
        }
        size--;
    }
    public T get(int index) {
        return array[index];
    }

    public boolean contains(T obj) {

        for(T object : array) {
            if(object == obj) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public void print() {
        if(size == 0 ) {
            System.out.println("List is empty");
            return;
        }
        for (int index = 0; index < size; index++) {
            System.out.println(array[index].toString());
        }
    }
}
