/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        return method(nums, nums.length - 1, nums.length);
    }
    public boolean method(int[] nums, int goal, int n) {
        
        for (int i = n - 2; i > -1; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;

    }
}

// @lc code=end

