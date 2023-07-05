package Strings;
import java.util.*;
public class Check_Palindrome {

    public static boolean isPalindrome(String str){
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("not a palindrome");
                return false;
            }
        }
        System.out.println("it's a palindrome");
        return true;
    }

    public static void main(String[] args) {

        String str ="moom";
        String fgr ="moomiro";
        isPalindrome(str);
        isPalindrome(fgr);


    }
}
/*
output

it's a palindrome
not a palindrome

*/