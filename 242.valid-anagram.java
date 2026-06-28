/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {

        int[] sCount = new int[26];
        int[] tCount = new int[26];

        // Check if lengths don't match
        if (s.length() != t.length()) {
            return false;
        }

        // Count how many of each char
        for (int i = 0; i < s.length(); i++)
            sCount[s.charAt(i) - 'a']++;

        for (int i = 0; i < t.length(); i++)
            tCount[t.charAt(i) - 'a']++;

        // Compare character counts
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end
