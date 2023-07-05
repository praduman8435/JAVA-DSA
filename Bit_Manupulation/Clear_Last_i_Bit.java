package Bit_Manupulation;

public class Clear_Last_i_Bit {

    public static int clearIBit(int n, int i){
        int bitMask =(~0)<<i;
        return n&bitMask;
    }

    public static void main(String[] args) {

        System.out.println(clearIBit(15,2));

    }
}
/*
output

12

*/