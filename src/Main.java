import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayUtils.addArray2D(1, 30, 4);
        System.out.print("--------------------------\n");//1 задание
        //-------------------------------------------------
        int[] a = new int[]{1, 2, 3, 4, 5};//2 задание
        ArrayUtils.reverseArray(a);
        System.out.println(Arrays.toString(a));
    }
}