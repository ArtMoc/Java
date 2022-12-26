package Task2;

import java.io.PrintStream;
import java.util.Scanner;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0)
            throw new ImpossibleShapeException("Rectangle can not have side less or equal to zero", "Rectzngle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSquare() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public Rectangle constructFromIO(Scanner in, PrintStream out) {
        out.println("Enter the side ");
        String side = in.next();
        double a = checkEntered(side);
        out.println("Enter the side ");
        double b = checkEntered(in.next());
        return new Rectangle(a, b);
    }
}
