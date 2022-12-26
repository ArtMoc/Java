package Task2;

import java.io.PrintStream;
import java.util.Scanner;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public Square constructFromIO(Scanner in, PrintStream out) {
        out.println("Enter the side ");
        double a = checkEntered(in.next());
        return new Square(a);
    }
}
