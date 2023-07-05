package Sorting_Algorithms;
import java.util.*;
public class Bubble_Sort_Descending {

    public static void bubble_decending(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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

        int que[]={3,6,2,1,8,7,4,5,3,1};
        bubble_decending(que);
        print_array(que);

    }
}
/*
output

8 7 6 5 4 3 3 2 1 1

*/