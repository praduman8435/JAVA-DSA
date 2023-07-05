package Sorting_Algorithms;
import java.util.*;
public class Insertion_Sort_Descending {

    public static void insertion_descending(int arr[]){
        for (int i=1;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
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

        insertion_descending(que);
        print_array(que);

    }
}
/*
output

8 7 6 5 4 3 3 2 1 1

*/