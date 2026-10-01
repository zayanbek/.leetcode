/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        int l = 1;
        int r = n;
        int res = 0;

        while (l <= r) {
            int m = l + (r - l) / 2;
            long rows = (long) m * (m + 1) / 2;

            if (rows > n) {
                r = m - 1;
            } else if (rows <= n) {
                res = Math.max(res, m);
                l = m + 1;
            }
        } 
        return res;
    }
}
// @lc code=end

