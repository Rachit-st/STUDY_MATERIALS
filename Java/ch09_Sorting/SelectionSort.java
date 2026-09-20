public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // time complexity of selection sort is O(n^2)
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
