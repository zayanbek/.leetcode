/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int left = 0;

        while (left < height.length - 1) {

            // Find a right wall that can hold water with height[left].
            int right = left + 1;

            while (right < height.length && height[right] < height[left]) {
                right++;
            }

            // If we didn't find a wall tall enough, use the tallest
            // wall to the right instead.
            if (right == height.length) {
                right = left + 1;

                for (int i = left + 2; i < height.length; i++) {
                    if (height[i] > height[right]) {
                        right = i;
                    }
                }
            }

            // Build the bucket: everything between left and right.
            ArrayList<Integer> bucket = new ArrayList<>();

            for (int i = left + 1; i < right; i++) {
                bucket.add(height[i]);
            }

            // Water level is determined by the shorter wall.
            int waterLevel = Math.min(height[left], height[right]);

            // Loop through the bucket and calculate water above each bar.
            for (int h : bucket) {
                if (waterLevel > h) {
                    totalWater += waterLevel - h;
                }
            }

            // Move to the right wall.
            left = right;
        }

        return totalWater;
    }
}
// @lc code=end

