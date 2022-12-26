package Task2;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        Shape example;
        try {
            example = new Menu().showMenu(in, out);
            do {
                try {
                    new ShapeCalcFlow().runShapeFlow(example, in, out);
                } catch (StopException e) {
                    example = new Menu().showMenu(in, out);
                }
            } while (true);
        }catch (ImpossibleShapeException e) {
            System.out.println("Finished calculations " + e.getShapeName());
        }
    }
}