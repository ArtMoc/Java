import java.util.Arrays;

public class Main {
    public static int[][] ex1(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] line : arr) {
        System.out.println(Arrays.toString(line));
        }
        return arr;
    }

    public static int[][] randomArr(int start, int end, int sizeArr) {
        int[][] arr = new int[sizeArr][sizeArr];

        for (int[] i : arr) {
            for (int j : i) {
                j = (int) (Math.random() * (end - start + 1) + start);
            }
        }
        return arr;
    }

    public static int ex2maxEl(int[][] arr) {
        int max = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }

    public static int ex2minEl(int[][] arr) {
        int min = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }

    public static int[][] ex3spiral(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int num = 1;
        int max = rows * cols;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = cols - 1;

        while (num <= max) {

            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;

            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;

            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;

            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }
        return arr;
    }
}