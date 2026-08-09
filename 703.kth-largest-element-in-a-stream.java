/*
 * @lc app=leetcode id=703 lang=java
 *
 * [703] Kth Largest Element in a Stream
 */

// @lc code=start
class KthLargest {

    int k;
    PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        
        this.k = k;        
        q =  new PriorityQueue<>();

        for (int n : nums) this.add(n);
    }
    
    public int add(int val) {
        q.offer(val);

        if (q.size() > k) q.poll();
        
        return q.peek();
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end

