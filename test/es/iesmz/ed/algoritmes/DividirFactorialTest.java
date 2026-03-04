package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DividirFactorialTest {

    @Test
    void test5sobre3() {
        DividirFactorial df = new DividirFactorial(5, 3);
        assertEquals(20, df.divisio());
    }

    @Test
    void test6sobre4() {
        DividirFactorial df = new DividirFactorial(6, 4);
        assertEquals(30, df.divisio()); // 6*5=30
    }

    @Test
    void testNumeradorIgualDenominador() {
        DividirFactorial df = new DividirFactorial(4, 4);
        assertEquals(1, df.divisio()); // 4!/4! = 1
    }

    @Test
    void testCero() {
        DividirFactorial df = new DividirFactorial(0, 0);
        assertEquals(1, df.divisio()); // 0!/0! = 1
    }

    @Test
    void testDenominadorCero() {
        DividirFactorial df = new DividirFactorial(5, 0);
        assertEquals(120, df.divisio()); // 5!/0! = 5! = 120
    }

    @Test
    void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new DividirFactorial(3, 5));
        assertThrows(IllegalArgumentException.class, () -> new DividirFactorial(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> new DividirFactorial(5, -1));
    }
}