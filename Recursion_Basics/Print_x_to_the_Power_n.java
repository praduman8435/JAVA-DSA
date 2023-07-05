package Recursion_Basics;

public class Print_x_to_the_Power_n {

    public static int x_power_n(int x,int n){
        if(n==0){
            return 1;
        }
        return x*x_power_n(x,n-1);
    }

    //optimised way

    public static int opt_x_power_n(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower=opt_x_power_n(x,n/2);
        int halfPowerSquare= halfPower*halfPower;
        //n is odd
        if(n%2!=0){
            halfPowerSquare=x*halfPowerSquare;
        }
        return halfPowerSquare;
    }

    public static void main(String[] args) {

        System.out.println(x_power_n(2,10));
        System.out.println(x_power_n(3,6));


        System.out.println(opt_x_power_n(2,10));
        System.out.println(opt_x_power_n(3,6));


    }
}
/*
output

1024
729
1024
729

*/