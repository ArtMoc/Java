import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestEx2 {
    @Test
    public void average_word_length_test() {
        String str = "Hello World!";
        double average = new Main().averageWordLength(str);
        Assertions.assertEquals(5.0, average);
    }
}
