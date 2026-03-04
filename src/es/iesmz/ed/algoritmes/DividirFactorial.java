package es.iesmz.ed.algoritmes;

/**
 * Clase que representa la división de factoriales de dos números.
 * Permite calcular el resultado de n! / m! sin calcular los factoriales completos.
 */
public class DividirFactorial {

    /** Numerador de la división (n!) */
    private final long numerador;

    /** Denominador de la división (m!) */
    private final long denominador;

    /**
     * Constructor de la clase.
     *
     * @param numerador Número del factorial del numerador
     * @param denominador Número del factorial del denominador
     */
    public DividirFactorial(long numerador, long denominador) {
        if (denominador < 0 || numerador < 0) {
            throw new IllegalArgumentException("Los números deben ser >= 0");
        }
        if (denominador > numerador) {
            throw new IllegalArgumentException("El denominador no puede ser mayor que el numerador");
        }

        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Calcula n! / m! de manera eficiente.
     *
     * @return resultado de la división factorial
     */
    public long divisio() {
        long result = 1;

        // Multiplicamos solo los números necesarios: n*(n-1)*...*(m+1)
        for (long i = denominador + 1; i <= numerador; i++) {
            result *= i;
        }

        return result;
    }
}