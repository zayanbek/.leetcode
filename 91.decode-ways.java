/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 */

// @lc code=start
class Solution {
    
    public int numDecodings(String s) {
        int len = s.length();
        int[] table = new int[len + 1];

        table[0] = 1;
        
        for (int i = 1; i <= len; i++) {
            int curr = s.charAt(i - 1) - '0';

            if (curr >= 1 && curr <= 9) {
                table[i] += table[i - 1];
            }

            if (i >= 2) {
                int prev = s.charAt(i - 2) - '0';
                int val = prev * 10 + curr;

                if (val >= 10 && val <= 26) {
                    table[i] += table[i - 2];
                }
            }
                
        }
        
        return table[len];
    }
}
// @lc code=end

