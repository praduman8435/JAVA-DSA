package Trie;
import java.util.*;
/*

Create a function boolean startsWith(String prefix) which returns true if the string starts with the prefix, otherwise, it returns false.

words = ["apple", "app", "man", "mango", "woman"]

prefix = "app"       output = true
prefix = "moon"      output = false

*/
public class StartsWith_Problem {

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for (int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for (int level=0; level<words.length(); level++){
            int index = words.charAt(level) - 'a';
            if (curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean startsWith(String prefix){
        Node curr = root;
        for (int level=0; level<prefix.length(); level++){
            int index = prefix.charAt(level) - 'a';
            if (curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }


    public static void main(String[] args) {
     String words[] = {"apple", "app", "mango", "man", "woman"};
     String prefix1 = "app";
     String prefix2 = "moon";

     for (int i=0; i<words.length; i++){
         insert(words[i]);
     }

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
/*

output
true
false

*/