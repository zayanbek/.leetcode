/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        
        for (char c : String.valueOf(Integer.toBinaryString(n)).toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

