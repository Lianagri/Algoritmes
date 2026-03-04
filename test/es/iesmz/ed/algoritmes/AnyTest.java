package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnyTest {

    @Test
    public void testDigitsDiferents() {
        Any a1 = new Any(2013);
        assertEquals(4, a1.digitsDiferents()); // 2,0,1,3

        Any a2 = new Any(2020);
        assertEquals(2, a2.digitsDiferents()); // 2,0

        Any a3 = new Any(1988);
        assertEquals(3, a3.digitsDiferents()); // 1,9,8

        Any a4 = new Any(2019);
        assertEquals(4, a4.digitsDiferents()); // 2,0,1,9
    }

    @Test
    public void testGetterSetter() {
        Any a = new Any(2000);
        assertEquals(2000, a.getAny());
        a.setAny(2015);
        assertEquals(2015, a.getAny());
    }
}