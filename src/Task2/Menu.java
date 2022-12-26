package Task2;

import java.io.PrintStream;
import java.util.Scanner;

public class Menu {
    public Shape showMenu(Scanner input, PrintStream output) {
        output.println("Select an action");
        output.println("1.Triangle\n2.Circle\n3.Square\n4.Rectangle\n5. or anything else to STOP this");
        return switch (input.nextInt()) {
            case 1 -> new Triangle(3d, 4d, 5d);
            case 2 -> new Circle(1d);
            case 3 -> new Square(1d);
            case 4 -> new Rectangle(2d, 3d);
            default -> throw new ImpossibleShapeException("Stop this!", "Any");
        };
    }
}
