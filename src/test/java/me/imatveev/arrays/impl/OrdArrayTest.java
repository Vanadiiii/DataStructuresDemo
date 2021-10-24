package me.imatveev.arrays.impl;

import me.imatveev.arrays.Array;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdArrayTest {
    private Array array;

    @BeforeEach
    void initArray() {
        array = new OrdArray(10);
    }


    @Test
    void checkArraySize() {
        Array array = new OrdArray(0);

        assertFalse(array.add(42));
    }

    @Test
    void checkAdd() {
        assertTrue(array.add(1));
        assertTrue(array.add(2));
        assertTrue(array.add(3));

        assertEquals(3, array.size());
    }

    @Test
    void checkContains() {
        assertFalse(array.contains(42));

        array.add(42);
        assertTrue(array.contains(42));
    }

    @Test
    void checkDelete() {
        array.add(42);
        assertEquals(1, array.size());

        assertFalse(array.delete(666));
        assertEquals(1, array.size());

        assertTrue(array.delete(42));
        assertEquals(0, array.size());

        assertFalse(array.delete(42));
        assertEquals(0, array.size());

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        assertEquals(4, array.size());
        assertTrue(array.delete(1));
        assertEquals(3, array.size());
    }
}
