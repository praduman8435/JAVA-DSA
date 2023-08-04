package Trie;

/*

Given an input string and a dictionary of words, find out if input string can be broken into a space-separated sequence of dictionary words.
words[] = {i, like, sam, samsung, mobile, ice}
key = "ilikesamsung"

output: true

*/
public class wordBreak_Probelm {
    static class Node{
        Node children[] = new Node[26];  // 26 alphabets
        boolean eow = false;  // end of word

        public Node(){
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

    public static boolean wordBreak(String key){
        if (key.length() == 0){
            return true;
        }
        for (int i=1; i<=key.length(); i++){
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for (int i=0; i<words.length; i++){
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
/*

output
true

*/