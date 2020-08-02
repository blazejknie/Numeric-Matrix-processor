package processor.matrixProcessor;

import processor.Matrix;
import processor.matrixProcessor.MatrixProcessor;

import java.util.Scanner;

public class MultiplyMatricesProcessor implements MatrixProcessor {
    @Override
    public void process() {
        Scanner in = new Scanner(System.in);
        Matrix[] matrixes = MatrixProcessor.getMatrices(in, 2);
        if (matrixes[0].getColumnsNum() != matrixes[1].getRowsNum()) {
            throw new ArithmeticException();
        }
        double[][] result = multiplyMatrixes(matrixes[0], matrixes[1]);
        MatrixProcessor.printMatrix(result);

    }

    private static double[][] multiplyMatrixes(Matrix first, Matrix second) {
        double[][] result = new double[first.getRowsNum()][second.getColumnsNum()];

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i = 0; i < second.getRowsNum(); i++) {
                    result[row][col] += first.getArray()[row][i] * second.getArray()[i][col];
                }
            }
        }
        return result;
    }

    private static double calcDotPoint(double[][] first, double[][] second, int row, int col) {
        double result = 0;
        for (int i = 0; i < second.length; i++) {
            result += first[row][i] * second[i][col];
        }
        return result;
    }

}
