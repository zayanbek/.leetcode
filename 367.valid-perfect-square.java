/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        long left = 1;
        long right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid;

            if (sqr > num) {
                right = mid - 1;
            } else if (sqr < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
// @lc code=end

