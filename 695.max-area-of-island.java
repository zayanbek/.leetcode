/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {

    int maxArea = 0, currentArea;
    int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                if(grid[row][col] == 1) {
                    dfs(row, col);
                    maxArea = Math.max(maxArea, currentArea);
                    currentArea = 0;
                }    
            }
        }

        return maxArea;
    }

    private void dfs(int row, int col) {

        if(
            row < 0 ||
            col < 0 ||
            row >= grid.length ||
            col >= grid[0].length ||
            grid[row][col] == 0
        ) return;

        currentArea++;
        grid[row][col] = 0;

        dfs(row + 1, col);
        dfs(row, col + 1);
        dfs(row - 1, col);
        dfs(row, col - 1);

    }
}

// @lc code=end

