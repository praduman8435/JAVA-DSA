package Bit_Manupulation;

public class Basics {
    public static void main(String[] args) {

        //binary and
        System.out.println(0&1);
        System.out.println(5&6);
        //hum tabhi false jb dono false

        //binary or
        System.out.println(0|0);
        System.out.println(4|3);
        //hum tabhi true jb dono true

        //binary xor
        System.out.println(4^6);
        System.out.println(0^1);
        //jb hum same tb hum false

        //binary one's complement
        System.out.println(~5);
        //convert 0-->1 & 1-->0

        //binary left shift
        //a<<b== a*2^b
        System.out.println(5<<2);


        //binary right shift
        //a>>b==a/2^b
        System.out.println(5>>2);

    }
}
/*
output

0
4
0
7
2
1
-6
20
1

*/
