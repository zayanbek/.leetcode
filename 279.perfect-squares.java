/*
 * @lc app=leetcode id=279 lang=java
 *
 * [279] Perfect Squares
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        int[] table = new int[n + 1];
        
        for (int i = 1; i <= n; i++) table[i] = n;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s * s <= i; s++) {
                table[i] = Math.min(
                    table[i], 1 + table[i - s*s]
                );
            }
        }
        

        return table[n];
    }
}
// @lc code=end

