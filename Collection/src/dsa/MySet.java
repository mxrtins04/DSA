package dsa;

import java.util.ArrayList;

public class MySet {
    private ArrayList<Integer> elements =  new ArrayList<Integer>();
    private int count = 0;
    public MySet() {
    }
    public MySet(int count) {
        this.count = count;
    }
    public boolean isEmpty() {
        if( count > 0 ) {
            return false;
        }
        return true;
    }

    public ArrayList<Integer> getElements() {
        return elements;
    }
    public void add(int i) {
        count++;
        elements.add(i);
    }

    public int length() {
        int length = getElements().size();
        return length;
    }

    public void clear() {
        for( int index = 0; index < length(); index++ ){
            elements.remove(index);}
    }

    public boolean contains(int i) {
        for( int index = 0; index < length(); index++ ){
            if( elements.get(index) == i)
                return true;
        }
        return false;
    }
}
