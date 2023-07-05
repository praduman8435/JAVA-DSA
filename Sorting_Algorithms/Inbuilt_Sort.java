package Sorting_Algorithms;
import java.util.*;
public class Inbuilt_Sort {

    public static void print_array(int arr[]){
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[]= {1,2,8,7,6,5};
            Arrays.sort(arr);
            print_array(arr);
    }
}
/*
output

1 2 5 6 7 8

*/