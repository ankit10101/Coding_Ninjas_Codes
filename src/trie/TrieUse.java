package trie;

public class TrieUse {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("ar");
        System.out.println(t.search("ar"));
        t.insert("are");
        t.insert("no");
        t.insert("not");
        t.insert("note");
        t.remove("ar");
        System.out.println(t.search("ar"));
    }
}
