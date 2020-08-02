package processor;

import processor.matrixProcessor.MatrixProcessor;
import processor.matrixProcessor.MatrixProcessorFactory;

import java.util.Scanner;

public class Main {
    private static final String MENU = "1. Add matrices\n"
            + "2. Multiply matrix to a constant\n"
            + "3. Multiply matrices\n"
            + "4. Transpose matrix\n"
            + "5. Calculate a determinant\n"
            + "6. Inverse matrix\n"
            + "0. Exit\n"
            + "Your choice: ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                showMenu();
                String  command = in.next();
                if (!command.equals("0")) {
                    MatrixProcessor processor = MatrixProcessorFactory
                            .getProcessor(command);
                    if (processor != null) {
                        processor.process();
                    }
                }else {
                    System.exit(0);
                }
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("ERROR");
            }
        }
    }

    private static void showMenu() {
        System.out.println(MENU);
    }
}
