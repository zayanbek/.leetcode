/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(
            intervals, 
            (a, b) -> Integer.compare(a[0], b[0])
        );
        
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int[] interval : intervals) {
            if (res.get(res.size() - 1)[1] >= interval[0]) {
                res.get(res.size() - 1)[0] = Math.min(
                    res.get(res.size() - 1)[0], interval[0]
                );
                res.get(res.size() - 1)[1] = Math.max(
                    res.get(res.size() - 1)[1], interval[1]
                );
            } else {
                res.add(interval);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}

// @lc code=end

