package processor.matrixProcessor;

import processor.Matrix;

import java.util.Scanner;

public class DeterminantProcessor implements MatrixProcessor {
    @Override
    public void process() {
        Scanner in = new Scanner(System.in);
        Matrix matrix = MatrixProcessor.getMatrices(in, 1)[0];
        if (matrix.getRowsNum() != matrix.getColumnsNum()) {
            throw new ArithmeticException();
        }
        System.out.println(calculateDeterminant(matrix.getArray()));
    }

    public static double calculateDeterminant(double[][] matrix) {
        if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 0) {
            return 0;
        }
        double det = 0;
        for (int i = 0; i < matrix.length; i++) {
            double[][] minor = getMinor(matrix, 0, i);
            det += matrix[0][i] * Math.pow(-1, 2 + i) * calculateDeterminant(minor);
        }
        return det;
    }

    public static double[][] getMinor(double[][] matrix, int row, int col) {
        double[][] minor = new double[matrix.length - 1][matrix.length - 1];
        int aRow = 0;
        for (int j = 0; j < matrix.length; j++) {
            if (j != row) {
                int aCol = 0;
                for (int k = 0; k < matrix.length; k++) {
                    if (k != col) {
                        minor[aRow][aCol++] = matrix[j][k];
                    }
                }
                aRow++;
            }
        }
        return minor;
    }
}
