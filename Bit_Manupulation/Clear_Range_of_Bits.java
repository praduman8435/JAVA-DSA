package Bit_Manupulation;

public class Clear_Range_of_Bits {
    public static int clearRangeOfBit(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n&bitMask;
    }

    public static void main(String[] args) {

        System.out.println(clearRangeOfBit(10,2,4));

    }
}
/*
output

2

*/