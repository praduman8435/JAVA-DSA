package Recursion_Basics;

public class Find_Occurance {

    public static int first_occ(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occ(arr,key,i+1);
    }

    public static void main(String[] args) {

        int arr[]= {1,5,6,7,5,8};
        System.out.println(first_occ(arr,5,0));

    }
}
/*
output

1

*/