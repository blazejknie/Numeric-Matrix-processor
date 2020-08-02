package processor.matrixProcessor;

import processor.Matrix;

import java.util.Scanner;

public interface MatrixProcessor {
    public static String MENU = "1. Add matrices\n"
                    + "2. Multiply matrix to a constant\n"
                    + "3. Multiply matrices\n"
                    + "0. Exit\n"
                    + "Your choice: ";

    void process();

    static Matrix[] getMatrices(Scanner in, int num) {
        Matrix[] matrices = new Matrix[num];
        for (int i = 0; i < num; i++) {
            matrices[i] = getMatrix(in);
        }
        return matrices;
    }

    private static Matrix getMatrix(Scanner in) {
        System.out.println("Enter size of matrix:");
        int row = Integer.parseInt(in.next());
        int col = Integer.parseInt(in.next());
        System.out.println("Enter matrix values:");
        double[][] array = new double[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Double.parseDouble(in.next());
            }
        }
        return new Matrix(array, row, col);
    }

    static void printMatrix(double[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            for (double point : row) {
                sb.append(String.format("%.2f ", point));
            }
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
