package processor.matrixProcessor.transpose;

import processor.Matrix;

public class SideDiagonalTransposeProcessor extends TransposeProcessor {
    @Override
    double[][] transpose(Matrix matrix) {
        double[][] array = matrix.getArray();
        double[][] result = new double[matrix.getRowsNum()][matrix.getColumnsNum()];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                result[row][col] =
                        array[matrix.getColumnsNum() - 1 - col]
                                [matrix.getRowsNum() - 1 - row];
            }
        }
        return result;
    }
}
