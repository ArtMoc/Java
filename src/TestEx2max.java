import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEx2max {
    @Test
    public void max(){
        int start = 0;
        int end = 100;
        int sizeArr = 10;
        int[][] arr = Main.randomArr(start,end,sizeArr);
        int max = Main.ex2maxEl(arr);
        for(int[] i : arr){
            for(int j : i){
                if(j > max){
                    Assertions.fail();
                }
            }
        }
    }
}
