package Bit_Manupulation;

public class Set_ith_Bit {

    public static int setIthbit(int n,int i){
        int bitMask =1<<i;
        return n|bitMask;
    }

    public static void main(String[] args) {

        System.out.println(setIthbit(10,2));


    }
}
/*
output

14

*/