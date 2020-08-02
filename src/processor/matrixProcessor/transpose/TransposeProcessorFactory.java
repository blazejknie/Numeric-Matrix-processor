package processor.matrixProcessor.transpose;

import processor.matrixProcessor.MatrixProcessor;

import java.util.Scanner;

public class TransposeProcessorFactory {
    private static final String MENU = "1. Main diagonal\n" +
            "2. Side diagonal\n" +
            "3. Vertical line\n" +
            "4. Horizontal line\n" +
            "Your choice: ";

    public static MatrixProcessor getTransposeProcessor() {
        Scanner in = new Scanner(System.in);
        System.out.println(MENU);
        String command = in.next();
        switch (command) {
            case "1":
                return new MainDiagonalTransposeProcessor();
            case "2":
                return new SideDiagonalTransposeProcessor();
            case "3":
                return new VerticalLineTransposeProcessor();
            case "4":
                return new HorizontalLineTransposeProcessor();
            default:
                System.out.printf("Option \"%s\" don`t exists!\n", command);
        }
        return null;
    }

}
