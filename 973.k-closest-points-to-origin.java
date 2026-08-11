/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Point {
    double distance;
    int[] coordinates;

    public Point(int[] point) {
        this.coordinates = point;
        this.distance = Math.sqrt(
            point[0]*point[0] + point[1]*point[1]
        );
    }

}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> minHeap = new PriorityQueue<>(
            (point1, point2) -> Double.compare(point1.distance, point2.distance)
        );

        for(int[] point : points) minHeap.offer(new Point(point));

        int[][] result = new int[k][2];

        for(int i = 0; i < k; i++) {
            
            int[] point = minHeap.poll().coordinates;
            
            result[i][0] = point[0];
            result[i][1] = point[1];
        }


        return result;
    }

    
}
// @lc code=end

