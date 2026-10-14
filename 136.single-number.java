/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) a ^= n;
        return a;
    }
}

// @lc code=end

