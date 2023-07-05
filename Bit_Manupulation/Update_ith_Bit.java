package Bit_Manupulation;

public class Update_ith_Bit {

    public static int setIthbit(int n,int i){
        int bitMask =1<<i;
        return n|bitMask;
    }


    public static int clearIthBit(int n, int i){
        int bitMask =~(1<<i);
        return n&bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        if (newBit==0){
            return clearIthBit(n,i);
        }else {
            return setIthbit(n,i);
        }
    }

    public static void main(String[] args) {

        System.out.println(updateIthBit(10,2,1));

    }
}
/*
output

14

*/