/*
 * @lc app=leetcode id=473 lang=java
 *
 * [473] Matchsticks to Square
 */

// @lc code=start
class Solution {

    private int[] matchsticks;
    private int target;

    public boolean makesquare(int[] matchsticks) {
        this.matchsticks = matchsticks;

        int sum = Arrays.stream(matchsticks).sum();
        if (sum % 4 != 0) return false;

        target = sum / 4;

        // Optional but important optimization:
        // Try larger matchsticks first.
        Arrays.sort(matchsticks);

        int[] sides = new int[4];
        return dfs(sides, matchsticks.length - 1);
    }

    private boolean dfs(int[] sides, int i) {
        if (i < 0) {
            return sides[0] == target &&
                   sides[1] == target &&
                   sides[2] == target &&
                   sides[3] == target;
        }

        int stick = matchsticks[i];

        for (int j = 0; j < 4; j++) {

            // Don't exceed target.
            if (sides[j] + stick > target) {
                continue;
            }

            // Avoid trying equivalent sides.
            if (j > 0 && sides[j] == sides[j - 1]) {
                continue;
            }

            sides[j] += stick;

            if (dfs(sides, i - 1)) return true;

            sides[j] -= stick;
        }

        return false;
    }
}

// @lc code=end

