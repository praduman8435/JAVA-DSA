package Sorting_Algorithms;
import java.util.*;
public class Bubble_Sort {

    public static void bubble_sort(int arr[]){
        for (int i=0 ;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
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
          bubble_sort(arr);
          print_array(arr);

    }
}
/*
output

1 2 5 6 7 8

*/