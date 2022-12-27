import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestEx1 {
    @Test
    public void string_of_digits_test() {
        int stringLength = 1000;
        StringBuilder str = new Main().stringOfDigits(stringLength);
        Assertions.assertEquals(8, str.charAt(8));
        Assertions.assertEquals(5, str.charAt(5));
    }
}
