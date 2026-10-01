/*
 * @lc app=leetcode id=2558 lang=java
 *
 * [2558] Take Gifts From the Richest Pile
 */

// @lc code=start
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int gift : gifts) {
            maxHeap.offer(-gift);
        }

        for (int i = 0; i < k; i++) {
            int pile = -maxHeap.poll();
            int newPile = (int) Math.sqrt(pile);
            maxHeap.offer(-newPile);
        }
        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += -maxHeap.poll();
        }
        return sum;
    }
}
// @lc code=end

