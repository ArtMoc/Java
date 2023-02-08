
public class BinarySearch {
    public static int linearSearch(int [] arr, int searched){
        for(int i=0;  i<arr.length; i++) {
            if(arr[i] == searched)
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int searchedElement){
        if(!ArrayUtils.isSorted(arr)){
            throw new IllegalArgumentException();
        }
        return recursiveBinarySearch(arr,0, arr.length-1, searchedElement);
    }
    private static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    public static int interpolationSearch(int[] arr, int elementToSearch) {

        int startIndex = 0;
        int lastIndex = (arr.length - 1);

        while ((startIndex <= lastIndex) && (elementToSearch >= arr[startIndex]) &&
                (elementToSearch <= arr[lastIndex])) {
            // используем формулу интерполяции для поиска возможной лучшей позиции для существующего элемента
            int pos = startIndex + (((lastIndex-startIndex) /
                    (arr[lastIndex]-arr[startIndex]))*
                    (elementToSearch - arr[startIndex]));

            if (arr[pos] == elementToSearch)
                return pos;

            if (arr[pos] < elementToSearch)
                startIndex = pos + 1;

            else
                lastIndex = pos - 1;
        }
        return -1;
    }
}