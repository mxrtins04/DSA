package dsa;

public class MyStack {

    boolean isEmpty = true;

    public void push(){
        isEmpty = false;
    }

    public void pop() {
        isEmpty = true;
    }
}
