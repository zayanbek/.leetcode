/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {

    char[][] grid;
    int count = 0;

    public int numIslands(char[][] grid) {
        this.grid = grid;

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                if(grid[row][col] == '1') {
                    dfs(row, col);
                    count++;
                }
            }
        }
            
        return count;
    }
    private void dfs(int row, int col) {
        if(
            row < 0 ||
            col < 0 ||
            row >= grid.length ||
            col >= grid[0].length ||
            grid[row][col] == '0'
        ) return;

        grid[row][col] = '0';

        dfs(row + 1, col);
        dfs(row, col + 1);
        dfs(row, col - 1);
        dfs(row - 1, col);
    }
}

// @lc code=end

