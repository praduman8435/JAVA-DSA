package Recursion_Basics;
import java.util.*;
public class Binary_String_Problem {

    public static void printBinString(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0, str+"0");
        if(lastplace==0){
            printBinString(n-1,1, str+"1");
        }
    }

    public static void main(String[] args) {

        printBinString(3,0, "");

    }
}
/*
output

000
001
010
100
101

*/