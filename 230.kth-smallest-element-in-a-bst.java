/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        
        inOrder(root, result);

        return result.get(k - 1);
    }

    public void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        // left, root, right

        inOrder(root.left, list);

        list.add(root.val);

        inOrder(root.right, list);
    }
}
// @lc code=end

