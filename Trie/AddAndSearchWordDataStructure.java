import java.util.HashMap;
import java.util.Map;

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
                children.put(c, node);
            }
 
            children = node.children;
 
            if(i == word.length()-1){
                node.isLeaf = true;
            }
        }
    }

    public boolean search(String word){
        return dfsSearch(root.children, word, 0);
    }
    
    private boolean dfsSearch(HashMap<Character, TrieNode> children, String word, int start) {
        
        if(start == word.length()){
            if(children.size()==0) 
                return true; 
            else
                return false;
        }
 
        char c = word.charAt(start);    
 
        if(children.containsKey(c)){
            if(start == word.length()-1 && children.get(c).isLeaf){
                return true;
            }
 
            return dfsSearch(children.get(c).children, word, start+1);
        }else if(c == '.'){
            boolean result = false;
            
            for(Map.Entry<Character, TrieNode> child: children.entrySet()){
                if(start == word.length()-1 && child.getValue().isLeaf){
                    return true;
                } 
 
                //if any path is true, set result to be true; 
                if(dfsSearch(child.getValue().children, word, start+1)){
                    result = true;
                }
            }
 
            return result;
        }else{
            return false;
        }
    }

}
