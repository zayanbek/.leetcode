/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] table = new int[len];
        table[len - 1] = 1;

        for (int i = len - 2; i >= 0; i--) {
            int max = Integer.MIN_VALUE;
            
            for (int j = i + 1; j < len; j++) {
                if (nums[j] > nums[i]) {
                    max = Math.max(max, table[j]);
                }

                table[i] = max + 1;
            }
        }
        
        int max = table[0];
        for (int n : table) max = Math.max(max, n);
        return max;
    }
} 

// @lc code=end

