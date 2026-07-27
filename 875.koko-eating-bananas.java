/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // find max
        int max = Integer.MIN_VALUE;
        for (int pile : piles) max = Math.max(max, pile);
        
        // binary search
        int l = 1, r = max, result = r;
        while (l <= r) {
            int m = (l + r) / 2;

            // calculate time
            int time = 0;
            for (int pile : piles) {
                time += Math.ceil(((double) pile) / m);
            }
            
            if (time > h) {
                l = m + 1;
            } else {
                r = m - 1;
                result = m;
            }

        }
        return result;
    }
}
// @lc code=end

