/*
 * @lc app=leetcode id=853 lang=java
 *
 * [853] Car Fleet
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int plen = position.length, slen = speed.length, fleets = 1;

        int[][] pair = new int[plen][2];
        for (int i = 0; i < plen; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        double prevTime = (double) (target - pair[0][0]) / pair[0][1]; // (target - pos ) / speed

        for (int i = 1; i < plen; i++) {
            double currTime = (double)(target - pair[i][0]) / pair[i][1];
            if (currTime > prevTime) {
                fleets++;
                prevTime = currTime;
            }
        }
        return fleets;
    }
}
// @lc code=end

