/*
 * @lc app=leetcode id=1863 lang=java
 *
 * [1863] Sum of All Subset XOR Totals
 */

// @lc code=start
class Solution {

    int sum = 0;
    int[] nums;

    public int subsetXORSum(int[] nums) {
        this.nums = nums;
        dfs(new ArrayList<>(), 0);
        return sum;
    }

    private void dfs(ArrayList<Integer> path, int i) {
        int xor = 0;
        for (int n : path) xor ^= n;
        sum += xor;

        for(int j = i; j < nums.length; j++) {
            path.add(nums[j]);
            dfs(path, j + 1);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end

