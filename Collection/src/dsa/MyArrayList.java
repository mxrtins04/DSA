package dsa;

public class MyArrayList {

    private String[] items;
    private int size;

    public MyArrayList() {
        items = new String[2];
        size = 0;
    }

    public void add(String element) {
        if (size == items.length) {
            growArray();
        }
        items[size] = element;
        size++;
    }

    public void add(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (size == items.length) {
            growArray();
        }

        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }

        items[index] = element;
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return items[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        size--;
    }

    public int size() {
        return size;
    }

    private void growArray() {
        String[] newArray = new String[items.length * 2];

        for (int index = 0; index < items.length; index++) {
            newArray[index] = items[index];
        }

        items = newArray;
    }
}
