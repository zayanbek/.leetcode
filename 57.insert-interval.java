/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            // before
            if (newInterval == null || interval[1] < newInterval[0]) { // end < start
                result.add(interval);
            }

            // after
            else if (interval[0] > newInterval[1]) { // start > end
                result.add(newInterval);
                result.add(interval);
                newInterval = null;
            }

            // overlap
            else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }


        }
        if (newInterval != null) result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}

// @lc code=end

