package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FactorialTest {

    @Test
    public void testGetFactorialsValidInput() {
        List<Long> expected = List.of(1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L);
        assertEquals(expected, Factorial.getFactorials(10));
    }

    @Test
    public void testGetFactorialsSingleValue() {
        List<Long> expected = List.of(1L);
        assertEquals(expected, Factorial.getFactorials(1));
    }

    @Test
    public void testGetFactorialsInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.getFactorials(0));
        assertThrows(IllegalArgumentException.class, () -> Factorial.getFactorials(-5));
    }
}
