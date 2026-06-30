/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            boolean found = false;

            for (List<String> group : result) {
                if (isAnagram(group.get(0), strs[i])) {
                    group.add(strs[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                result.add(newGroup);
            }
        }

        return result;

    }

    public boolean isAnagram(String s, String t) {

        int[] count = new int[26];

        // Check if lengths don't match
        if (s.length() != t.length()) {
            return false;
        }

        // Count how many of each char
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        // Compare character counts
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end
