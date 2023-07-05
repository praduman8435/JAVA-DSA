package Strings;
import java.util.*;
public class Compare {

    public static void main(String[] args) {

            String s1 = "tony";
            String s2 = "tony";
            String s3 = new String("tony");
            if (s1.equals(s3)) {
                System.out.println("Strings are equal");
            } else{
                System.out.println("Strings are not equal");
            }
    }
}
/*
output

Strings are equal

*/