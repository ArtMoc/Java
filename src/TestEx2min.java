import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEx2min {
    @Test
    public void min(){
        int start = 0;
        int end = 100;
        int sizeArr = 10;
        int[][] arr = Main.randomArr(start,end,sizeArr);
        int min = Main.ex2minEl(arr);
        for(int[] i : arr){
            for(int j : i){
                if(j < min){
                    Assertions.fail();
                }
            }
        }
    }
}
