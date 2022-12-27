import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestEx3 {
    @Test
    public void number_of_evenWords_test() {
        String str = "Hello World!";
        int evenWords = new Main().numberOfEvenWords(str);
        Assertions.assertEquals(1, evenWords);
    }
}
