/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // fill top row
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        // fill left side
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }

        // loop through whats remaining
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
            }
        }

        return dp[m - 1][n - 1];
    }
}

// @lc code=end

