public class ArrayUtils {
    //Задание 1 Создать класс ArrayUtils в пакете ru.top.java212 и статический метод создания квадратной матрицы (двуерного массива) из целых чисел, заполненный случайными числами
    // из интервала [a, b], a,b и размерность массива — параметры метода. Метод вызвать из main, организовать вывод полученного массива на экран.
    public static int[][] addArray2D(int a, int b, int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * (b - a + 1) + a);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
        return arr;
    }
    //Задание 2 В созданном в задании 1 классе реализовать private рекурсивный метод,
    // переворачивающий одномерный массив. Сигнатура метода private static int[] reverse(int[] arr, int index).
    //Когда индекс равен 0 — возвращаемся из рекурсии, элементы меняем местами через дополнительную переменную,
    // уменьшая индекс на каждом вызове reverse


    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length - 1);

    }

    private static int[] reverse(int[] arr, int start, int end) {
        if (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            reverse(arr, start+1, end-1);
        }
        return arr;
    }
}