package Arrays;
import java.util.*;
public class Largest_Number {

    public static void largest_no(int a[]){
        int num=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i]>num){
                num=a[i];
            }
        }
        System.out.println("largest value is "+num);
    }

    public static void main(String[] args) {

        int y[]={4,3,8,6,5,37,88,43};
        largest_no(y);

    }
}

/*
output

largest value is 88

*/