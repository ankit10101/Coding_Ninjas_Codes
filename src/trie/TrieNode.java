package trie;

public class TrieNode {
    char data;
    TrieNode[] children;
    boolean isTerminating;
    int childCount;

    public TrieNode(char data){
        this.data = data;
        children = new TrieNode[26];
    }

    public TrieNode getChild(char charAt) {
        return children[charAt - 'a'];
    }

    public void addChild(char charAt, TrieNode child) {
        children[charAt - 'a'] = child;
        childCount++;
    }
}
