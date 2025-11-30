package dsa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    @Test
    public void testSetIsEmptyUponDecleration() {
        MySet set = new MySet();
        assertTrue(set.isEmpty());
    }

    @Test
    public void testSetIsNotEmptyAfterAnElementIsAdded() {
        MySet set = new MySet();
        set.add(4);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testAddAddsElementToSet() {
        MySet set = new MySet();
        set.add(4);
        assertEquals(4, set.getElements().get(0));
    }


    @Test
    public void testClearMakesSetEmpty() {
        MySet set = new MySet();
        set.add(4);
        set.add(5);
        set.add(6);

        assertFalse(set.isEmpty());
        set.clear();
        assertTrue(set.isEmpty());

    }

    @Test
    public void testClearRemovesAllElementsFromSet() {
        MySet set = new MySet();
        set.add(4);
        set.add(5);
        set.add(6);
        set.clear();
        assertEquals(0, set.length());

    }

    @Test
    public void testContainsWorks(){
        MySet set = new MySet();
        set.add(4);
        set.add(5);
        assertTrue(set.contains(4));
    }


}
