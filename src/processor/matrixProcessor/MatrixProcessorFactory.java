package processor.matrixProcessor;

import processor.matrixProcessor.transpose.*;

public class MatrixProcessorFactory {

    public static MatrixProcessor getProcessor(String command) {
        switch (command) {
            case "1":
                return new MatrixAdditionProcessor();
            case "2":
                return new MultiplyMatrixByConstantProcessor();
            case "3":
                return new MultiplyMatricesProcessor();
            case "4":
                return TransposeProcessorFactory.getTransposeProcessor();
            case "5":
                return new DeterminantProcessor();
            case "6":
                return new InversionProcessor();
            default:
                System.out.printf("Option \"%s\" don`t exists!\n", command);
        }
        return null;
    }

}
