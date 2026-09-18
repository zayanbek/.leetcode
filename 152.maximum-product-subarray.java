/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
public class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = 1, curMax = 1;

        for (int num : nums) {
            int tmp = curMax * num;
            curMax = tripleMax(num * curMax, num * curMin, num);
            curMin = tripleMin(tmp, num * curMin, num);
            res = Math.max(res, curMax);
        }
        return res;
    }

    private int tripleMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    
    private int tripleMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}

// @lc code=end

