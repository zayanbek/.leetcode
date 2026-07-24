/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int val = -1;

        for(int i = 0; i < nums.length; i++) {
            val = Math.abs(nums[i]);

            if (nums[val] >= 1) {
                nums[val] *= -1;
            } else {
                return val;
            }

        }

        return -1;
    }
}
// @lc code=end

