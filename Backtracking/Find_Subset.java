package Backtracking;
import java.util.*;
public class Find_Subset {

    public static void findSubset(String str, String ans, int index){
        if(index==str.length()){
            if (ans.length()==0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }

        findSubset(str,ans+str.charAt(index),index+1);
        findSubset(str,ans,index+1);
    }

    public static void main(String[] args) {

        String str="abc";
        findSubset(str,"",0);

    }
}
/*
output

abc
ab
ac
a
bc
b
c
null

*/