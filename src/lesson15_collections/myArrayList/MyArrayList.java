package lesson15_collections.myArrayList;

public class MyArrayList<T> {
    private T [] array;

    private int objectsCount;
    private int size;



    public MyArrayList() {
        this.array = (T[]) new Object[3];
    }

    public MyArrayList(int arrayLength) {
        this.array = (T[]) new Object[arrayLength];
        this.size = arrayLength;
    }

    public void add(T obj) {
        if (objectsCount >= array.length) {
            int newCapacity = array.length * 3 / 2 + 1;
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, objectsCount);
            array = newArray;
            this.size = newCapacity;
        }

        array[objectsCount++] = obj;
    }

    public void remove(int index) {
        while (index < objectsCount) {
            array[index] = array[index++];
        }
        objectsCount--;
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
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        objectsCount = 0;
    }

    public void print() {
        if(objectsCount == 0 ) {
            System.out.println("List is empty");
            return;
        }
        for (int index =0; index < objectsCount; index++) {
            System.out.println(array[index].toString());
        }
    }
}
