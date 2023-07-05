package Recursion_Basics;

public class Check_Array_Sorted_or_Not {

    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static void main(String[] args) {

        int arr[]= {1,5,6,7,5,8};
        System.out.println(isSorted(arr,0));
        int brr[]= {1,3,6,9,14};
        System.out.println(isSorted(brr,0));

    }
}
/*
output

false
true

*/