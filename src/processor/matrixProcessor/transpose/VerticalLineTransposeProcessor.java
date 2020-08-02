package processor.matrixProcessor.transpose;

import processor.Matrix;

public class VerticalLineTransposeProcessor extends TransposeProcessor {
    @Override
    double[][] transpose(Matrix matrix) {
        double[][] array = matrix.getArray();
        double[][] result = new double[matrix.getRowsNum()][matrix.getColumnsNum()];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                result[row][col] = array[row][matrix.getColumnsNum() - 1 - col];
            }

        }
        return result;
    }
}
