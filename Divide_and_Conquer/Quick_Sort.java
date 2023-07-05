package Divide_and_Conquer;
import java.util.*;
public class Quick_Sort {

    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {3, 8, 2, 5, 1, 4, 7, 6};
        quickSort(arr, 0, arr.length - 1);
        print(arr);

    }
}
/*
output

1 2 3 4 5 6 7 8

*/