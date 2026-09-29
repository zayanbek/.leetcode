/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            while (
                !stack.isEmpty() && 
                a < 0 && 
                stack.peek() > 0
            ) {
                int diff = a + stack.peek();
                if (diff < 0) {
                    stack.pop();
                } else if (diff > 0) {
                    a = 0;
                } else {
                    a = 0;
                    stack.pop();
                }
            }
            if (a != 0) {
                stack.add(a);
            }
        }

        int[] result = new int[stack.size()];
        int i = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[i] = stack.pop();
            i--;
        }
        return result;

    }
}
// @lc code=end

