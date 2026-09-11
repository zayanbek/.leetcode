/*
 * @lc app=leetcode id=746 lang=java
 *
 * [746] Min Cost Climbing Stairs
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] table = new int[n + 1];

        for(int i = 2; i <= n; i++) {
            int oneStep = table[i - 1] + cost[i - 1];
            int twoStep = table[i - 2] + cost[i - 2];
            table[i] = Math.min(oneStep, twoStep);
        }

        return table[n];
    }
}

// @lc code=end

