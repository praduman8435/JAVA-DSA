package Bit_Manupulation;
import java.util.*;
public class Check_Odd_or_Even {

    public static void oddOrEven(int n){
        int bitmask =1;
        if ((n&bitmask) ==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {

        oddOrEven(3);
        oddOrEven(5);
        oddOrEven(4);

    }
}
/*
output

odd
odd
even

*/