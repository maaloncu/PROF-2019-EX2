package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class ClaseExamenTest {

    @Test
    void test6() {
        assertEquals(Arrays.asList(2, 3), ClaseExamen.primos(6));
    }

    @Test
    void test13() {
        assertEquals(Arrays.asList(13), ClaseExamen.primos(13));
    }

    @Test
    void test15() {
        assertEquals(Arrays.asList(3, 5), ClaseExamen.primos(15));
    }

    @Test
    void test25() {
        assertEquals(Arrays.asList(5, 5), ClaseExamen.primos(25));
    }

    @Test
    void testInvalid() {
        assertThrows(EntradaInvalida.class, () -> ClaseExamen.primos(1));
    }
}
