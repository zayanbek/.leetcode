/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int val = nums[0];
        for (int n : nums) {
            if(!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
            
            if (map.get(n) > max) {
                max = map.get(n);
                val = n;
            }
        }

        return val;
    }
}
// @lc code=end

