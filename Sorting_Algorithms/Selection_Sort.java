package Sorting_Algorithms;
import java.util.*;
public class Selection_Sort {

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print_array(int arr[]){
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[]= {1,2,8,7,6,5};
        selection_sort(arr);
        print_array(arr);

    }
}
/*
output

1 2 5 6 7 8

*/