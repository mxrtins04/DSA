package dsa;

public class MyStack {

    private int numberOfItems = 0;
    private String[] items = new String[3];

    public void push(String item){
        items[numberOfItems] = item;
        numberOfItems++;
    }

    public boolean isEmpty(){
        if(numberOfItems > 0)
            return false;
        else return true;
    }
    public String pop() {
        if(numberOfItems == 0) throw new IllegalArgumentException("Stack is empty");
        numberOfItems--;
        return items[numberOfItems];
    }


    public String peek() {
        return items[numberOfItems-1];
    }
}
