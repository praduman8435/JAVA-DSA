package Arrays;
import java.util.*;
public class Binary_Search {

    public static void binary_search(int a[], int key){
        int start=0;
        int end=a.length-1;
        int mid=(start+end)/2;
        while (start<=end){
            if (a[mid]==key){
                System.out.println("key is at "+mid);
                return;
            }
            else if (a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }

    public static void main(String[] args) {

        int o[]={4,3,8,6,5,37,88,43};
        binary_search(o,6);

    }
}
/*
output

key is at 3

*/
