package Task2;

import java.io.PrintStream;
import java.util.Scanner;


public class Triangle extends Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new ImpossibleShapeException("Triangle with 0 or less side is not allowed", "Triangle");
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new ImpossibleShapeException("Triangle with such sides is not possible", "Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getSquare() {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - b) * (pp - c) * (pp - a));
    }

    @Override
    public double getPerimeter() {
        return a + b + b;
    }


    @Override
    public Triangle constructFromIO(Scanner in, PrintStream out) {
        out.println("Enter the side ");
        double a = checkEntered(in.next());
        out.println("Enter the side ");
        double b = checkEntered(in.next());
        out.println("Enter the side ");
        double c = checkEntered(in.next());
        return new Triangle(a, b, c);
    }
}
