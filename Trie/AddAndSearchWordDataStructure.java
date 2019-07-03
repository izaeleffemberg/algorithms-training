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

        HashMap<Character, TrieNode> children = root.children;

        for(int i=0; i<word.length(); i++){

            char c = word.charAt(i);
 
            TrieNode node = null;

            if(children.containsKey(c)){
                node = children.get(c);
            }else{
                node = new TrieNode(c);
                children.put(c,t);
            }
 
            children = node.children;
 
            if(i == word.length()-1){
                node.isLeaf = true;
            }
        }
    }

}
