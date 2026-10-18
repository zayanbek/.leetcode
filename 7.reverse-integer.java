/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
public class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;

        long num = Math.abs((long)x);

        long res = Long.parseLong(
            new StringBuilder(String.valueOf(num))
                .reverse()
                .toString()
        );

        if (negative) {
            res = -res;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) res;
    }
}

// @lc code=end

