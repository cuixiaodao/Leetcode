package hashTable;

/**
 * Created by cuixiaodao on 12/12/2017
 * for leetCode problem:
 * https://leetcode.com/problems/implement-magic-dictionary
 */

public class MagicDictionary{
    private Node root;

    private class Node{
        public boolean val = false;
        public Node[] nextNode = new Node[26];        
    }

    /** Initialize your data structure here. */
    public MagicDictionary() {
        root = new Node();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {        
        for(String s : dict){
            Node walk = root;            
            for(char c : s.toCharArray()){
                if(walk.nextNode[c-'a'] == null)
                    walk.nextNode[c-'a'] = new Node();

                walk = walk.nextNode[c-'a'];
            }
            walk.val = true;
        }                
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        return search(word, root, 0, false);
    }

    private boolean search(String word, Node root, int start, Boolean modfied){       
        if(start == word.length()) return modfied && root.val;

        int alphaPos = word.charAt(start)-'a';
        for(int i=0; i<root.nextNode.length; i++){
            if(root.nextNode[i] == null) continue;

            if(i != alphaPos){
                if(modfied) continue;
                if(search(word, root.nextNode[i], start+1, true))
                    return true;
            }
            else if(search(word, root.nextNode[i], start+1, modfied))
                return true;
        }
        return false;
    }
}