package Task2;

public class ImpossibleShapeException extends RuntimeException{
    private final String shapeName;

    public ImpossibleShapeException(String message, String shapeName) {
        super(message);
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }
}
