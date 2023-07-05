package Sorting_Algorithms;
import java.util.*;
public class Selection_Sort_Descending {

    public static void selection_descending(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int max=i;
            for (int j=i+1;j< arr.length-1;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            //swap
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
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
        selection_descending(que);;
        print_array(que);

    }
}
/*
output

8 7 6 5 4 3 3 2 1 1

*/