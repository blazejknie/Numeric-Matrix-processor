package processor.matrixProcessor;

import processor.Matrix;
import processor.matrixProcessor.MatrixProcessor;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyMatrixByConstantProcessor implements MatrixProcessor {
    @Override
    public void process() {
        Scanner in = new Scanner(System.in);
        Matrix[] matrixes = MatrixProcessor.getMatrices(in, 1);
        int num = Integer.parseInt(in.next());
        double[][] result = multiplyMatrixByNumber(matrixes[0].getArray(), num);
        MatrixProcessor.printMatrix(result);
    }

    public static double[][] multiplyMatrixByNumber(double[][] array, double num) {
        double[][] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[i][j] * num;
            }
        }
        return result;
    }

}
