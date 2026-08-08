/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        int[] res = new int[n * 2];

        for (int i = 0; i < n; i++) {
            int val = nums[i];

            res[i] = val;
            res[i + n] = val;
        }

        return res;
    }
}
// @lc code=end

