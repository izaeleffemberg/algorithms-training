public class AddAndSearchWordDataStructure{
    public class TrieNode{
        public TrieNode[] children;
        boolean isWord;
        String item = "";

        TrieNode(){
            children = TrieNode[26];
            isWorld = false;
        }
    }

    public TrieNode root = new TrieNode();

    }

}
