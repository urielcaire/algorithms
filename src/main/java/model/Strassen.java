package main.java.model;

public class Strassen {
    public Strassen(){
        // TO DO
    }

    private void divAndConquerMM(int[][] m1, int[][] m2, int n){
        // TO DO
    }

    public int[][] simpleMatrixMultiplication(int[][] m1, int[][] m2){
        int m3[][] = new int[m1.length][m2[0].length];

        for (int i = 0; i < m3.length; i++){
            for (int j = 0; j < m3[0].length; j++){
                m3[i][j] = 0;
                for (int k = 0; k < m2.length; k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return m3;
    }
}
