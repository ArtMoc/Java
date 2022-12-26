package Task2;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class Shape {
    public abstract double getSquare();

    public abstract double getPerimeter();

    public abstract Shape constructFromIO(Scanner in, PrintStream out);

    protected double checkEntered(String side) {
        if (side.trim().equalsIgnoreCase("stop"))
            throw new StopException("Going back to menu ...");
        return Double.parseDouble(side);
    }
}
