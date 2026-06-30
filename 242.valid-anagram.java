/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return new String(sArray).equals(new String(tArray));
    }
}
// @lc code=end
