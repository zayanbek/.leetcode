/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        
        int longest = 0;

        for(int n : set) {
            if (!set.contains(n - 1)) {
                int len = 1;
                while(set.contains(n + len)) len++;
                
                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}
// @lc code=end

