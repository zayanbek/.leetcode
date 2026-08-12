/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {

    List<List<Integer>> result = new ArrayList<>();;
    boolean[] alreadyPicked;
    
    public List<List<Integer>> permute(int[] nums) {
        alreadyPicked = new boolean[nums.length];

        backtrack(new ArrayList<>(), nums);
        return result;
    }

    public void backtrack(List<Integer> currentPermutation, int[] nums) {
        
        // base case
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!alreadyPicked[i]) {
                // do
                currentPermutation.add(nums[i]);
                alreadyPicked[i] = true;
                backtrack(currentPermutation, nums);
                
                // undo
                currentPermutation.remove(currentPermutation.size() - 1);
                alreadyPicked[i] = false;
            }
        }
    }

}
// @lc code=end

