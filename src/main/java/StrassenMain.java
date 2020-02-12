package main.java;

import main.java.model.Strassen;

public class StrassenMain {
    public static void main(String[] args) {
        Strassen str = new Strassen();

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[1][0] = 3;
        matriz1[1][1] = 4;
        matriz2[0][0] = 5;
        matriz2[0][1] = 6;
        matriz2[1][0] = 7;
        matriz2[1][1] = 8;

        int[][] result = str.simpleMatrixMultiplication(matriz1,matriz2);

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[0].length; j++){
                System.out.print("["+i+"]["+j+"]: "+result[i][j]+"  ");
            }
            System.out.println("");
        }

    }
}
