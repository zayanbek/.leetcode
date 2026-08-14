/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start

class Solution {

    Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return new ArrayList<>(result);
    }

    private void backtrack(int[] nums, int i, List<Integer> subset) {
        
        // base case
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // do
        subset.add(nums[i]);
        backtrack(nums, i + 1, subset);

        // undo
        subset.remove(subset.size() - 1);
        backtrack(nums, i + 1, subset);
    }
}
// @lc code=end

