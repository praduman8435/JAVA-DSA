package Trie;
import java.util.*;
/*

Find shortest unique prefix for every word in a given list, Assume that no word is prefix of another.

arr[] = {"zebra", "dog", "duck", "dove"}
Output: dog, dov, du, z

*/
public class Prefix_problem {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
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
                else{
                    curr.children[index].freq++;
                }
                curr = curr.children[index];
            }
            curr.eow = true;
        }

    public static void findPrefix(Node root, String ans){
        if (root == null){
            return;
        }
        if (root.freq == 1){
            System.out.print(ans+ " ");
            return;
        }
        for (int i=0; i<root.children.length; i++){
            if (root.children[i] != null){
                    findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {

        String words[] = {"zebra", "dog", "duck", "dove"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        root.freq = -1;
        findPrefix(root, "");
    }
}
/*

output
dog dov du z

*/