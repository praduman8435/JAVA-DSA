package Strings;
import java.util.*;
public class Number_of_Vowels_Occured {
    public static void main(String[] args) {

        String str = new Scanner(System.in).next();
        int count =0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("count of vowel is :"+count);

    }
}
/*
output

gtrefiughierk
count of vowel is :5

*/