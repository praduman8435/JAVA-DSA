package Bit_Manupulation;

public class Clear_ith_Bit {

    public static int clearIthBit(int n, int i){
        int bitMask =~(1<<i);
        return n&bitMask;
    }

    public static void main(String[] args) {

        System.out.println(clearIthBit(10,3));

    }
}
/*
output

2

*/