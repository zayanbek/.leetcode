/*
 * @lc app=leetcode id=417 lang=java
 *
 * [417] Pacific Atlantic Water Flow
 */

// @lc code=start
class Solution {

    List<List<Integer>> result = new ArrayList<>();
    int[][] heights;
    int[][] directions = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };
    boolean visitedPacific = false;
    boolean visitedAtlantic = false;
    int ROWS, COLS;

    public List<List<Integer>> pacificAtlantic(
        int[][] heights
    ) {
        
        this.heights = heights;
        ROWS = heights.length;
        COLS = heights[0].length;

        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLS; col++) {

                boolean[][] visited = new boolean[ROWS][COLS];

                if(dfs(row, col, visited)) {
                    result.add(Arrays.asList(row, col));
                }

                visitedPacific = false;
                visitedAtlantic = false;
            }
        }

        return result;
    }

    private boolean dfs(
        int row, int col, boolean[][] visited
    ) {
        if (visited[row][col]) return false;

        visited[row][col] = true;

        if (row == 0 || col == 0) {
            visitedPacific = true;
        }

        if (row == ROWS - 1 || col == COLS - 1) {
            visitedAtlantic = true;
        }

        if (visitedPacific && visitedAtlantic) {
            return true;
        }
        
        int val = heights[row][col];

        for(int[] dir : directions) {
            int r = row + dir[0];
            int c = col + dir[1];
            if (inBounds(r, c) && heights[r][c] <= val) {
                if (dfs(r, c, visited)) return true; 
            } 
        }

        return visitedPacific && visitedAtlantic;
    }

    private boolean inBounds(int r, int c) {
        return (
            r >= 0 && 
            c >= 0 && 
            r < ROWS && 
            c < COLS
        );
    }
}

// @lc code=end

