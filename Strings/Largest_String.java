package Strings;
import java.util.*;
public class Largest_String {
    public static void main(String[] args) {

        //str1.compareTo(str2)-->treat A & a differently
        //str1.compareToIgnoreCase(str2)-->treat a & A as same
        // 0: equals
        //<0: str1<str2
        //>0: str1>str2
        String fruits[] ={"apple","mango","banana"};
        String largest = fruits[0];
        for (int i=1;i<fruits.length;i++){
           if( largest.compareTo(fruits[i])<0){
               largest=fruits[i];
           }
        }
        System.out.println(largest);

    }
}
/*
output

mango

*/