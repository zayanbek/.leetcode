/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0, right = 0;
        
        char c = s.charAt(right);
        while (!set.contains(c) && right < s.length() - 1)
        {
            set.add(c);
            right++;
            c = s.charAt(right);
        }
            
        


        return 0;

    }
}
// @lc code=end

