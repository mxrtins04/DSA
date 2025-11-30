package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    MyStack stack;

    @BeforeEach
    public void setup() {
        stack = new MyStack();
    }
    @Test
    public void testStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackIsNotEmptyWhenIAddAnItem(){
        stack.push("jjk");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testAddingAndRemovingAnItemMakesStackEmpty(){
        stack.push("jjk");
        stack.pop();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void testAddingTwoElementsToStackAndPoppingOneDoesNotMakeStackEmpty(){
        stack.push("kkd");
        stack.push("s");
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatPopReturnsLastItemAddedToStack(){
        stack.push("james");
        assertEquals(stack.pop(), "james");
    }

    @Test
    public void testPopCantRemoveFromAnEmptyStack(){
        stack.push("jjk");
        stack.pop();
        assertThrows(IllegalArgumentException.class, () -> stack.pop());

    }

    @Test
    public void testPeekReturnsLastItemAddedToStack(){
        stack.push("jjk");
        stack.push("kkd");
        assertEquals("kkd", stack.peek());
    }


    /*@Test
    public void testStackCanNotContainMoreThanSetCapacity(){

        stack.push("l");
        stack.push("i think im cooked");
        stack.push("hellppp");

    }*/


}
