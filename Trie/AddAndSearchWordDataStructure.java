import java.util.HashMap;

public class AddAndSearchWordDataStructure{
    public class TrieNode{
        char character;
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();        
        boolean isLeaf = false;
        
        TrieNode(){}
        
        TrieNode(char character){
            this.character = character;
        }
    }

    private TrieNode root;

    public AddAndSearchWordDataStructure(){
        root = new TrieNode();
    }

    public void add(String word){
        
    }

}
