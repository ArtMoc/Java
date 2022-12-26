package Task2;
import java.io.PrintStream;
import java.util.Scanner;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        if (radius <= 0)
            throw new ImpossibleShapeException("Circle cannot have negative radius", "Circle");
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public Circle constructFromIO(Scanner in, PrintStream out) {
        out.println("Enter the radius ");
        double a = checkEntered(in.next());
        return new Circle(a);
    }
}
