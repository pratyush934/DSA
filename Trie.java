import java.util.*;

public class Trie {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { /* O(L) */
        Node curr = root;
        for(int level =0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key) { /* O(L) */
        Node curr = root;
        for(int level =0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

       return curr.eow == true;
    }

    public static boolean wordBreak(String key) {
        if(key.length()==0) return true;


        for(int i=1; i<=key.length(); i++) {
            if(search(key.substring(0, i)) &&
            wordBreak(key.substring(i)/* i ko as a beginning pass karega */)) {
                return true;
            } 

        }
        return false;
    }

    public static void wordBreakString() {
        String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }
        System.out.println(wordBreak("ilikesamsung"));    
    }
    

    public static void exampleString() {
        String word[] = { "the", "a", "there", "their", "any", "thee"};
        for(int i=0; i<word.length; i++) {
            insert(word[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
    
    public static boolean startsWith(String prefix) {
        Node curr = root;

        for(int i=0; i<prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }

    public static void main2() { 
        String words[] = {"apple", "app", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startsWith(prefix1));  
        System.out.println(startsWith(prefix2));
    }

    public static int countNodes(Node root) { /* O(1) */
        if(root == null) return 0;

        int count = 0;
        for(int i=0; i<26; i++) {
            if(root.children[i] != null)
            count += countNodes(root.children[i]);
        }

        return count + 1;
    }

    public static void main3() {
        String str = "ababa";

        /* suffix --> insert in trie */
        for(int i=0; i<str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

       System.out.println(countNodes(root));
    }
    public static String ans = " ";
    public static void longestWord(Node root, StringBuilder temp) {
        if(root == null) {
            return;
        }

        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eow == true) {
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()) { /* Same length ke liye No Update */
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); /* Backtrack */
            }
        }
    }

    public static void main4() {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(" "));
        System.out.println(ans);
    }

    static class Node1 {
        Node1[] children = new Node1[26];
        boolean eow = false;
        int freq;

        public Node1() {
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
            freq = 1;

            
        }
    }
   

    public static Node1 root1 = new Node1();

    public static void insert1(String word) {
        Node1 curr = root1;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node1();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node1 root1, String ans) {

        if(root == null) return;

        if(root1.freq == 1) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root1.children.length; i++) {
            if(root1.children[i] != null) {
                findPrefix(root1.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main1() {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<arr.length; i++) {
            insert1(arr[i]);
        }

        root1.freq = -1;
        findPrefix(root1, "--> ");
    }

    public static void main(String args[]) {
    main4();
    }
}