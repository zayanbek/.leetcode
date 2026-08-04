/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        ArrayList<TreeNode> parents = new ArrayList<>();
        parents.add(root);

        return func(parents, result);
    }

    List<List<Integer>> func(ArrayList<TreeNode> parents, List<List<Integer>> result) {
        
        
        if (parents.isEmpty()) return result;
        
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList<TreeNode> children = new ArrayList<>();

        for(TreeNode node : parents) {

            values.add(node.val);

            TreeNode left = node.left;
            TreeNode right = node.right;

            if (left != null) children.add(left);
            if (right != null) children.add(right);

        }

        result.add(values);

        return func(children, result);

    }
}
// @lc code=end

