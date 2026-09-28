/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {          
                int a = stack.pop();
                int b = stack.pop();
                int c = a + b;
                stack.push(b);
                stack.push(a);
                stack.push(c);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int a = stack.peek();
                stack.push(a * 2);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }

        return sum;
    }
}
// @lc code=end

