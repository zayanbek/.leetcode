/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        
        int minLen = Integer.MAX_VALUE;
        for (String word : strs) {
            minLen = Math.min(minLen, word.length());
        }

        for (int letterIdx =0; letterIdx < minLen; letterIdx++) {
            char c = strs[0].charAt(letterIdx);
            boolean validLetter = true; 
            for (String word : strs) {
                if (word.charAt(letterIdx) != c) {
                    validLetter = false;
                }
            }
            if (validLetter) {
                res += "" + c;
            } else {
                break;
            }
        }
        return res;
    }
}
// @lc code=end

