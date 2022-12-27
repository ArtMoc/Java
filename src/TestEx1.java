import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEx1 {
    @Test
    public void ex1_fillArr(){
        int n = 10;
        int m = 10;
        int[][] arr = new Main().ex1(n,m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != (i + 1) * (j + 1)) {
                    Assertions.fail();

                }
            }
        }
    }
}
