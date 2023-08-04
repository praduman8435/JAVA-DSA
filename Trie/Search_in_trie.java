package Trie;
import java.util.*;
public class Search_in_trie {
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

        public static boolean search(String key) {
            Node curr = root;
            for (int level = 0; level < key.length(); level++) {
                int index = key.charAt(level) - 'a';
                if (curr.children[index] == null) {
                    return false;
                }
                curr = curr.children[index];
            }
            return curr.eow == true;
        }

        public static void main(String[] args) {
            String words[] = {"the", "a", "there", "any", "thee", "their"};
            for (int i = 0; i < words.length; i++) {
                insert(words[i]);
            }
            System.out.println(search("the"));
            System.out.println(search("these"));
        }
    }

/*

output
true
false

*/