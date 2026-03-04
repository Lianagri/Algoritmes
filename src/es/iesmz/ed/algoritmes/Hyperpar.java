
   package es.iesmz.ed.algoritmes;

    /**
     * Clase que representa un número y permite comprobar
     * si es Hyperpar.
     *
     * Un número es Hyperpar si todos sus dígitos son pares.
     */
    public class Hyperpar {

        private final long numero;

        /**
         * Constructor de la clase.
         * @param numero número a comprobar
         */
        public Hyperpar(long numero) {
            this.numero = numero;
        }

        /**
         * Comprueba si el número es Hyperpar.
         * @return true si todos los dígitos son pares,
         *         false en caso contrario
         */
        public boolean esHyperPar() {

            long n = Math.abs(numero);

            if (n == 0) {
                return true;
            }

            while (n > 0) {
                long digito = n % 10;

                if (digito % 2 != 0) {
                    return false;
                }

                n /= 10;
            }

            return true;
        }
    }

