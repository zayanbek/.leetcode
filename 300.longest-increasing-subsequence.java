/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    int[] nums;
    int[] memo;
    int len;
    public int lengthOfLIS(int[] nums) {
        this.nums = nums;
        len = nums.length;
        memo = new int[len];
        Arrays.fill(memo, -1);

        int max = 1;
        for(int i = 0; i < len; i++) {
            max = Math.max(max, dfs(i));
        }
        return max;
    }

    private int dfs(int i) {
        if (memo[i] != -1) return memo[i];

        int max = 1;
        for (int j = i + 1; j < len; j++) {
            if (nums[j] > nums[i]) {
                max = Math.max(max, 1 + dfs(j));
            }
        }

        memo[i] = max;
        return max;
        
    }
} 

// @lc code=end

