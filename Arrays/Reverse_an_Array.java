package Arrays;
import java.util.*;
public class Reverse_an_Array {

    public static void reverse_array(int a[]){
        int start=0;
        int end=a.length-1;
        while (start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int u[]={4,3,8,6,5,37,88,43};
        reverse_array(u);

    }
}
/*
output

43 88 37 5 6 8 3 4

*/