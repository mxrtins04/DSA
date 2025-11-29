package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    @Test
    public void testStackIsEmpty() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty);
    }

    @Test
    public void testStackIsNotEmptyWhenIAddAnItem(){
        MyStack stack = new MyStack();
        stack.push();
        assertFalse(stack.isEmpty);
    }

    @Test
    public void testAddingAndRemovingAnItemMakesStackEmpty(){
        MyStack stack = new MyStack();
        stack.push();
        stack.pop();
        assertTrue(stack.isEmpty);

    }

    @Test
    public void testStackIsEm(){
        MyStack stack = new MyStack();
    }

}
