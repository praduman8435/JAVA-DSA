package Recursion_Basics;

public class Print_Decreasing_Order {

    public static void print_dec(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print_dec(n-1);
    }

    public static void main(String[] args) {

        print_dec(5);

    }
}
/*
output

5 4 3 2 1

*/