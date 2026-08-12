/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> currentSubset = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        
        dfs(nums, 0);

        return result;
    }

    private void dfs(int[] nums, int treeLevel) {
        
        // base case
        if (treeLevel >= nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        // do
        currentSubset.add(nums[treeLevel]);
        dfs(nums, treeLevel + 1);
        
        // undo
        currentSubset.remove(currentSubset.size() - 1);
        dfs(nums, treeLevel + 1);
    }
}

// @lc code=end

