package Trie;
import java.util.*;
/*

Given a string of length n of lowercase alphabet characters, we need to count total number of distinct substrings of this string.

str = "ababa"
output = 10

*/
public class Count_Unique_String {
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

    public static boolean search(String key){
        Node curr = root;
        for (int level=0; level<key.length(); level++){
            int index = key.charAt(level) - 'a';
            if (curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return curr.eow == true;
    }

    public static int countNodes(Node root){
       if (root == null){
           return 0;
       }

       int count = 0;
       for (int i=0; i<26; i++){
           if (root.children[i] != null){
               count+= countNodes(root.children[i]);
           }
       }
       return count+1;
    }

    public static void main(String[] args) {
        String str = "ababa";

        for (int i=0; i<str.length(); i++){
            for (int j=i; j<str.length(); j++){
                String suffix = str.substring(i);
                insert(suffix);
            }
        }
        System.out.println(countNodes(root));
    }
}
/*

output
10

*/