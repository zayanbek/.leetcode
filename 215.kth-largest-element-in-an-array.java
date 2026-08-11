/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : nums) {
            minHeap.offer(n);

            if (minHeap.size() > k) minHeap.poll(); 
        }
        return minHeap.peek();
    
    }
}

// @lc code=end

