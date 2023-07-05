package Recursion_Basics;

public class Last_Occurance {

    public static int last_occ(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        int isFound= last_occ(arr,key,i+1);
        if(isFound== -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {

        int arr[]= {1,5,6,7,5,8};
        System.out.println(last_occ(arr,5, 0));

    }
}
/*
output

4

*/