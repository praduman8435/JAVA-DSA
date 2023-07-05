package Sorting_Algorithms;
import java.util.*;
public class Inbuilt_Sort_Descending {

    public static void print_array(Integer arr[]){
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

            Integer que[]={3,6,2,1,8,7,4,5,3,1};
            Arrays.sort(que,Collections.reverseOrder());
            print_array(que);

    }
}
/*
output

8 7 6 5 4 3 3 2 1 1

*/