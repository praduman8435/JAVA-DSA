package Trie;

/*

Trie is an efficient information retrieval data structure. Using trie, search complexities can be brought to optimal limit (key length).

Every node of trie consists of multiple branches.
Each branch represents a possible character of keys.

*/
public class Insert_in_trie {
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
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "any", "thee", "their"};
        for (int i=0; i<words.length; i++) {
            insert(words[i]);
        }
    }
}
