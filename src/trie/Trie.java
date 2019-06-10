package trie;

public class Trie {
    private TrieNode root;
    private int count;

    public Trie(){
        root = new TrieNode('\0');
        count = 0;
    }

    public void insert(String word){
        if(insert(root,word))
            count++;
    }

    private boolean insert(TrieNode root, String word){
        if(word.length() == 0){
            if(root.isTerminating){
                return false;
            }else {
                root.isTerminating = true;
                return true;
            }
        }
        TrieNode child = root.getChild(word.charAt(0));
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.addChild(word.charAt(0),child);
        }
            return insert(child,word.substring(1));
    }

    public boolean search(String word){
      return search(root,word);
    }

    private boolean search(TrieNode root, String word){
        if(word.length() == 0){
            return root.isTerminating;
        }
        TrieNode child = root.getChild(word.charAt(0));
        if(child == null){
            return false;
        }else{
            return search(child,word.substring(1));
        }
    }

    public void remove(String word){
        if(remove(root,word))
            count--;
    }

    private boolean remove(TrieNode root, String word){
        if(word.length() == 0){
            if(root.isTerminating){
                root.isTerminating = false;
                if(root.children.length != 0)
                    root.children = null;
                return true;
            }else {
                return false;
            }
        }
        TrieNode child = root.getChild(word.charAt(0));
        if(child == null){
            return false;
        }else{
            return search(child,word.substring(1));
        }
    }
}
