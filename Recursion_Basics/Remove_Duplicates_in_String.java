package Recursion_Basics;
import java.util.*;
public class Remove_Duplicates_in_String {

    public static void remove_duplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr_Char=str.charAt(idx);
        if(map[curr_Char-'a']==true){
            remove_duplicate(str, idx+1, newStr,map);
        }
        else {
            map[curr_Char-'a']=true;
            remove_duplicate(str, idx+1,newStr.append(curr_Char), map);
        }
    }

    public static void main(String[] args) {

        String str="aaapnnacolleege";
        remove_duplicate(str, 0,new StringBuilder(""), new boolean[26]);

    }
}
/*
output

apncoleg

*/