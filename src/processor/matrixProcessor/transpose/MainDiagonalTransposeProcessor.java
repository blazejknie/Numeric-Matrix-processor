package processor.matrixProcessor.transpose;


import processor.Matrix;

public class MainDiagonalTransposeProcessor extends TransposeProcessor {
    @Override
    double[][] transpose(Matrix matrix) {
        double[][] array = matrix.getArray();
        double[][] result = getMainDiagonalTransposedMatrix(array);
        return result;
    }

    public static double[][] getMainDiagonalTransposedMatrix(double[][] array) {
        double[][] result = new double[array[0].length][array.length];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                result[row][col] = array[col][row];
            }
        }
        return result;
    }
}
