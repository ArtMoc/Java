import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilTest extends Main {
    @Test
    public void testAddArray(){
        int a = 1;
        int b = 30;
        int n = 5;
        int[][] arr = ArrayUtils.addArray2D(a,b,n);
        for(int[] line : arr){
            for(int el : line){
                if(el < a || el > b){
                    Assertions.fail();
                }
            }
        }
    }
}