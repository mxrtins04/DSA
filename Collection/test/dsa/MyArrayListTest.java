package dsa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void testConstructorStartsEmpty() {
        MyArrayList list = new MyArrayList();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddIncreasesSize() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        assertEquals(2, list.size());
    }

    @Test
    public void testArrayGrowsWhenFull() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        assertEquals("c", list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    public void testAddAtIndexMiddle() {
        MyArrayList list = new MyArrayList();

        list.add("a");
        list.add("c");
        list.add(1, "b");

        assertEquals("b", list.get(1));
        assertEquals(3, list.size());
        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddAtIndexZero() {
        MyArrayList list = new MyArrayList();

        list.add("b");
        list.add(0, "a");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAtIndexEnd() {
        MyArrayList list = new MyArrayList();

        list.add("a");
        list.add("b");
        list.add(2, "c");

        assertEquals("c", list.get(2));
    }

    @Test
    public void testAddWithInvalidIndexThrows() {
        MyArrayList list = new MyArrayList();
        list.add("a");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(-1, "x");
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.add(5, "x");
        });
    }

    @Test
    public void testGetValidIndexReturnsCorrectValue() {
        MyArrayList list = new MyArrayList();
        list.add("hello");

        assertEquals("hello", list.get(0));
    }

    @Test
    public void testGetInvalidIndexThrows() {
        MyArrayList list = new MyArrayList();
        list.add("a");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(-1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(2);
        });
    }

    @Test
    public void testRemoveShiftsElementsLeft() {
        MyArrayList list = new MyArrayList();

        list.add("a");
        list.add("b");
        list.add("c");

        list.remove(1); // remove "b"

        assertEquals("c", list.get(1)); // shifted
        assertEquals(2, list.size());
    }

    @Test
    public void testRemoveFirstElement() {
        MyArrayList list = new MyArrayList();

        list.add("x");
        list.add("y");

        list.remove(0);

        assertEquals("y", list.get(0));
    }

    @Test
    public void testRemoveLastElement() {
        MyArrayList list = new MyArrayList();

        list.add("a");
        list.add("b");

        list.remove(1);

        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveInvalidIndexThrows() {
        MyArrayList list = new MyArrayList();
        list.add("a");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(-1);
        });

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(2);
        });
    }
}
