package me.imatveev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDTest {

    @Test
    void checkArraySize() {
        ArrayD arrayD = new ArrayD(0);
        boolean result = arrayD.add(42);

        assertFalse(result);
    }

    @Test
    void checkAdd() {
        ArrayD arrayD = new ArrayD(10);

        assertTrue(arrayD.add(1));
        assertTrue(arrayD.add(2));
        assertTrue(arrayD.add(3));

        assertEquals(3, arrayD.size());
    }

    @Test
    void checkFind() {
        ArrayD arrayD = new ArrayD(10);

        assertFalse(arrayD.find(42));

        arrayD.add(42);
        assertTrue(arrayD.find(42));
    }

    @Test
    void checkDelete() {
        ArrayD arrayD = new ArrayD(10);

        arrayD.add(42);
        assertEquals(1, arrayD.size());

        assertFalse(arrayD.delete(666));
        assertEquals(1, arrayD.size());

        assertTrue(arrayD.delete(42));
        assertEquals(0, arrayD.size());

        assertFalse(arrayD.delete(42));
        assertEquals(0, arrayD.size());

        arrayD.add(1);
        arrayD.add(2);
        arrayD.add(3);
        arrayD.add(4);
        assertEquals(4, arrayD.size());
        assertTrue(arrayD.delete(1));
        assertEquals(3, arrayD.size());
    }
}
