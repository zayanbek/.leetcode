/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int n : nums) min = Math.min(min, n);

        return min;
    }
}
// @lc code=end

