package Task2;



import org.jetbrains.annotations.NotNull;

import java.io.PrintStream;
import java.util.Scanner;

public class ShapeCalcFlow {
    public void runShapeFlow(Shape example, Scanner in, PrintStream out) {
        double prevSquare = 0d;
        do {
            Shape s = readShape(example, in, out);
            double newSquare = s.getSquare();
            //double newPerimeter = s.getPerimeter();
            int comparison = Double.compare(prevSquare,newSquare);
            if (comparison == 0 )
                out.println("Previous was same");
            if (comparison > 0)
                out.println("Previous was bigger");
            if (comparison < 0)
                out.println("Previous was smaller");
        } while (true);

    }

    @NotNull
    Shape readShape(Shape example, Scanner in, PrintStream out) {
        Shape s;
        do {
            try {
                s = example.constructFromIO(in, out);
            } catch (NumberFormatException | ImpossibleShapeException e) {
                out.println("Sorry, the input is incorrect, let's restart creating the shape");
                s = null;
            }
        } while (s == null);
        return s;
    }
}
