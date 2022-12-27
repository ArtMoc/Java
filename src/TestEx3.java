import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEx3 {
    @Test
    public void array(){
        int rows = 10;
        int cols = 10;
        int[][] arr = Main.ex3spiral(rows,cols);
        Assertions.assertEquals(3,arr[0][2]);
        Assertions.assertEquals(4,arr[0][3]);
    }
}
