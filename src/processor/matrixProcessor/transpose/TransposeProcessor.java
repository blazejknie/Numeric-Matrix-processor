package processor.matrixProcessor.transpose;

import processor.Matrix;
import processor.matrixProcessor.MatrixProcessor;

import java.util.Scanner;

public abstract class TransposeProcessor implements MatrixProcessor {
    @Override
    public void process() {
            Scanner in = new Scanner(System.in);
            Matrix[] matrices = MatrixProcessor.getMatrices(in, 1);
            double[][] result = transpose(matrices[0]);
            MatrixProcessor.printMatrix(result);
    }

    abstract double[][] transpose(Matrix matrix);
}
