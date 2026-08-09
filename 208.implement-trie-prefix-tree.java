/*
 * @lc app=leetcode id=208 lang=java
 *
 * [208] Implement Trie (Prefix Tree)
 */

// @lc code=start
class TreeNode {

    HashMap<Character, TreeNode> map;
    boolean isEndOfWord;

    TreeNode() {
        
        this.isEndOfWord = false;
        this.map = new HashMap<>();
    }
    
}


class Trie {

    TreeNode root;

    public Trie() {
        root = new TreeNode();
    }

    public void insert(String word) {

        TreeNode prev = root;

        for (char c : word.toCharArray()) {
            prev.map.putIfAbsent(c, new TreeNode());
            prev = prev.map.get(c);
        }
    
        prev.isEndOfWord = true;
    }

    public boolean search(String word) {
        TreeNode curr = root;

        for (char c : word.toCharArray()) {
            if (!curr.map.containsKey(c)) return false;
            curr = curr.map.get(c);
        }

        return curr.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TreeNode curr = root;

        for (char c : prefix.toCharArray()) {
            if (!curr.map.containsKey(c)) return false;
            curr = curr.map.get(c);
        }

        return true;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

