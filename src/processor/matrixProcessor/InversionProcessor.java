package processor.matrixProcessor;

import processor.Matrix;
import processor.matrixProcessor.transpose.MainDiagonalTransposeProcessor;

import java.util.Scanner;

public class InversionProcessor implements MatrixProcessor {
    @Override
    public void process() {
        Matrix matrix = MatrixProcessor.getMatrices(new Scanner(System.in), 1)[0];
        double[][] array = matrix.getArray();
        double determinant = DeterminantProcessor.calculateDeterminant(array);
        if (determinant == 0) {
            throw new ArithmeticException();
        }

        double[][] adjoint = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                adjoint[i][j] = Math.pow(-1, i + j + 2) * DeterminantProcessor
                        .calculateDeterminant(DeterminantProcessor.getMinor(array, i, j));
            }
        }
        adjoint = MainDiagonalTransposeProcessor.getMainDiagonalTransposedMatrix(adjoint);
        double[][] result = MultiplyMatrixByConstantProcessor.multiplyMatrixByNumber(adjoint, 1 / determinant);
        MatrixProcessor.printMatrix(result);
    }
}
