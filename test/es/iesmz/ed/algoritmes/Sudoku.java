package es.iesmz.ed.algoritmes;

public class Sudoku {
    //Matriz 9x9 con numeros del 1 al 9
    private  int[][] sudoku;

    //Constructor que recibe matriz
    public  Sudoku(int[][] sudoku){

        this.sudoku=sudoku;
    }

    //Comprobamos si el sudoku es correcto
    public boolean esCorrecto(){
        //Comprobamos filas  y columnas
        for (int i=0;i<9; i++){
            boolean[] fila = new boolean[9];
            boolean[] col = new boolean[9];
            for (int j=0; j<9; j++){

                int numFilea = sudoku[i][j];
                if(fila[numFilea - 1]){
                    return false;
                }else{
                    fila[numFilea-1] =true;
                }

                int numCol=sudoku[j][i];
                if (col[numCol-1]){
                    return false;
                }else{
                    col[numCol-1]=true;
                }
            }
        }
        // Comprobamos regiones 3x3

        for (int filaInicio =0; filaInicio<9; filaInicio+=3){
            for (int colInicio =0; colInicio<9; colInicio++){
                boolean[] region = new boolean[9];
                for (int i=0; i< 3; i++){
                    for (int j=0;j<3; j++){
                        int num= sudoku[filaInicio +i][colInicio +j];
                        if (region[num-1]){
                            return false;
                        }else {
                            return true;
                        }
                    }
                }
            }
        }
        //si no encuentro ningun repetido
        return true;
    }

    public static void main(String[] args) {
        int[][] ejmpSudoku = {
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
        };

        Sudoku s=new Sudoku(ejmpSudoku);
        System.out.println("Sudoku correcto: " + s.esCorrecto());

    }
}
