package es.iesmz.ed.algoritmes;
import java.util.ArrayList;

public class CalculMental {

        private String operacion;

        public CalculMental(String operacion) {
            this.operacion = operacion;
        }

        public ArrayList<Integer> calcula(){

            String[] partes = operacion.split(" ");

            ArrayList<Integer> resultados = new ArrayList<>();

            int resultado = Integer.parseInt(partes[0]);

            for (int i = 1; i < partes.length; i += 2){

                String operador = partes[i];

                if (operador.equals(".")){
                    break;
                }

                int numero = Integer.parseInt(partes[i+1]);

                if (operador.equals("+")){
                    resultado = resultado + numero;
                }
                else if (operador.equals("-")){
                    resultado = resultado - numero;
                }

                resultados.add(resultado);
            }

            return resultados;
        }

        public static void main(String[] args) {

            String operacion = "15 + 8 - 7 + 10 - 3 .";

            CalculMental numero = new CalculMental(operacion);

            ArrayList<Integer> resultados = numero.calcula();

            for (int i = 0; i < resultados.size(); i++){
                System.out.println("Paso " + (i + 1) + ": " + resultados.get(i));
            }
        }
    }

