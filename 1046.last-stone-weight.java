/*
 * @lc app=leetcode id=1046 lang=java
 *
 * [1046] Last Stone Weight
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones) maxHeap.offer(stone);
        
        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();
            int x = maxHeap.poll();

            if (x < y) maxHeap.offer(y - x);
            
        }

        int k = maxHeap.size();

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
        
    }
}

// @lc code=end

