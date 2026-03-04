package es.iesmz.ed.algoritmes;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa un año y permite calcular
 * cuántos dígitos diferentes tiene.
 */
public class Any {

    private long any; // el año

    // Constructor: recibe un número que representa el año
    public Any(long any) {
        this.any = any;
    }

    /**
     * Calcula cuántos dígitos diferentes tiene el año.
     * Ejemplo: 2013 -> dígitos 2,0,1,3 -> 4 diferentes
     *
     * @return número de dígitos distintos
     */
    public int digitsDiferents() {
        Set<Character> digitos = new HashSet<>();
        String str = String.valueOf(any);
        for (char c : str.toCharArray()) {
            digitos.add(c);
        }
        return digitos.size();
    }

    // Getter del año
    public long getAny() {
        return any;
    }

    // Setter del año (por si quieres cambiarlo)
    public void setAny(long any) {
        this.any = any;
    }
}