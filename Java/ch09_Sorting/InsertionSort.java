package ch09_Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
        insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // time complexity of insertion sort is O(n^2)
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
