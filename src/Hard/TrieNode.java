package Hard;

import java.util.ArrayList;
import java.util.HashMap;

public class TrieNode {

    private HashMap<Character, TrieNode> children;
    private ArrayList<Integer> indexes;
    private char value;

    public TrieNode(){
        children = new HashMap<Character, TrieNode>();
        indexes = new ArrayList<Integer>();
    }

    public void insertString(String s, int index){
        indexes.add(index);
        if(s != null && s.length() > 0){
            value = s.charAt(0);
            TrieNode child;
            if(children.containsKey(value)){
                child = children.get(value);
            } else{
                child = new TrieNode();
                children.put(value, child);
            }
            String remainder = s.substring(1);
            child.insertString(remainder, index + 1);
        } else{
            children.put('\0', null);
        }
    }

    public ArrayList<Integer> search(String s){
        if(s == null || s.length() == 0){
            return indexes;
        }
        char first = s.charAt(0);
        if(children.containsKey(first)){
            String remainder = s.substring(1);
            return children.get(first).search(remainder);
        }
        return null;
    }

    public boolean terminates(){
        return children.containsKey('\0');
    }

    public TrieNode getChild(char c){
        return children.get(c);
    }

}