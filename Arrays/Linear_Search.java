package Arrays;
import java.util.*;
public class Linear_Search {

    public static void linear_search(int a[], int key){
        for (int i=0;i<a.length;i++){
            if (a[i]==key) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("key is not presents");
    }

    public static void main(String[] args) {

        int m[]={4,3,8,6,5,37,88,43};
        linear_search(m,5);
        linear_search(m,37);
        linear_search(m,57);

    }
}

/*
output

4
5
key is not presents

*/