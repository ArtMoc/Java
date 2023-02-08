public class ArrayUtils {
    public static int[][] addArray2D(int a, int b, int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * (b - a + 1) + a);
            }
        }
        return arr;
    }
    public static void reverseArray(int[] arr) {
        if (arr.length > 0) {
            System.out.print(arr[arr.length - 1] + " ");
            int[] index = new int[arr.length - 1];
            for (int i = 0; i < index.length; i++) {
                index[i] = arr[i];
            }
            reverseArray(index);
        }
    }
    public static Boolean isSorted(int [] arr) {
        Boolean ascendingOrder = true;
        if (arr[0] > arr[1]) {
            ascendingOrder = false;
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (ascendingOrder) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] getMainDiagonal(int[][] twoDimensionalArray) {
        int diagonalSize = ArrayUtils.diagonalSize(twoDimensionalArray);
        int [] mainDiagonal = new int[diagonalSize];
        for(int i = 0; i < mainDiagonal.length; i++){
            mainDiagonal[i] = twoDimensionalArray[i][i];
        }
        return  mainDiagonal;
    }
    public static int diagonalSize(int [][] twoDimensionalArray){
        int rowSize = twoDimensionalArray.length;
        int columnSize = twoDimensionalArray[0].length;
        int diagonalSize = rowSize;
        if(rowSize > columnSize){
            diagonalSize = columnSize;
        }
        return diagonalSize;
    }
    public static void changeMainDiagonal(int [][] twoDimensionalArray, int [] diagonal){
        int diagonalArraySize = ArrayUtils.diagonalSize(twoDimensionalArray);
        if(diagonal.length != diagonalArraySize){
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < diagonalArraySize; i++){
            twoDimensionalArray[i][i] = diagonal[i];
        }
    }
    public static int[] getRow(int[][] twoDimensionalArray,int rowPosition){
        int [] row = new int[twoDimensionalArray[0].length];
        for(int i = 0; i < twoDimensionalArray[0].length; i++){
            row[i] = twoDimensionalArray[rowPosition][i];
        }
        return row;
    }
    public static void changeRowFromTwoDimArray(int [][] twoDimArray,int array[],int rowPosition){
        if(twoDimArray[0].length != array.length){
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < array.length; i++){
            twoDimArray[rowPosition][i] = array [i];
        }
    }
}
