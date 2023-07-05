package Sorting_Algorithms;
import java.util.*;
public class Counting_Sort {

    public static void counting_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i< arr.length-1; i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i< count.length;i++){
            while (count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
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
        counting_sort(arr);
        print_array(arr);
    }
}
/*
output

1 2 5 6 7 8

*/