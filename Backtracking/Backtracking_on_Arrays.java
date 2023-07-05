package Backtracking;
import java.util.*;
public class Backtracking_on_Arrays {

    public static void change_arr(int arr[], int i, int value){

        if (i == arr.length){
            printArr(arr);
            return;
        }

        arr[i]=value;
        change_arr(arr,i+1,value+1);
        arr[i]= arr[i]-2;

    }
    public static void printArr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        change_arr(arr,0,1);
        printArr(arr);
    }
}
/*
output

1 2 3 4 5
-1 0 1 2 3

*/