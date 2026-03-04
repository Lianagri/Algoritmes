package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @Test
    void numeroHyperpar() {
        Hyperpar h = new Hyperpar(24680);
        assertTrue(h.esHyperPar());
    }

    @Test
    void numeroNoHyperpar() {
        Hyperpar h = new Hyperpar(2568);
        assertFalse(h.esHyperPar());
    }

    @Test
    void numeroCeroEsHyperpar() {
        Hyperpar h = new Hyperpar(0);
        assertTrue(h.esHyperPar());
    }

    @Test
    void numeroNegativoHyperpar() {
        Hyperpar h = new Hyperpar(-2486);
        assertTrue(h.esHyperPar());
    }

    @Test
    void numeroUnSoloDigitoPar() {
        Hyperpar h = new Hyperpar(8);
        assertTrue(h.esHyperPar());
    }

    @Test
    void numeroUnSoloDigitoImpar() {
        Hyperpar h = new Hyperpar(7);
        assertFalse(h.esHyperPar());
    }

    @Test
    void numeroGrandeHyperpar() {
        Hyperpar h = new Hyperpar(888888888);
        assertTrue(h.esHyperPar());
    }

    @Test
    void numeroGrandeNoHyperpar() {
        Hyperpar h = new Hyperpar(888888889);
        assertFalse(h.esHyperPar());
    }
}