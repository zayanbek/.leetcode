/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

import java.util.HashSet;
import java.util.Set;

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end