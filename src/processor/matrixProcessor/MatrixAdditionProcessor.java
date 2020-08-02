package processor.matrixProcessor;

import processor.Matrix;
import processor.matrixProcessor.MatrixProcessor;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdditionProcessor implements MatrixProcessor {
    @Override
    public void process() {
        Scanner in = new Scanner(System.in);
        Matrix[] matrixes = MatrixProcessor.getMatrices(in, 2);
        double[][] result = addMatrixes(matrixes[0], matrixes[1]);
        MatrixProcessor.printMatrix(result);
    }

    private static double[][] addMatrixes(Matrix first, Matrix second) {
        if (first.getRowsNum() != second.getRowsNum() || first.getColumnsNum() != second.getColumnsNum()) {
            throw new ArithmeticException();
        }
        double[][] firstArr = first.getArray();
        double[][] secondArray = second.getArray();
        double[][] result = Arrays.copyOf(firstArr, firstArr.length);
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < firstArr[i].length; j++) {
                result[i][j] = firstArr[i][j] + secondArray[i][j];
            }
        }
        return result;
    }

}
