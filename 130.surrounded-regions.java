/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

// @lc code=start
class Solution {

    int ROWS, COLS;
    boolean[][] visited;

    public void solve(char[][] board) {

        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {

                if (board[row][col] == 'O' && !visited[row][col]) {

                    List<int[]> region = new ArrayList<>();

                    if (dfs(row, col, board, region)) {
                        for (int[] cell : region) {
                            board[cell[0]][cell[1]] = 'X';
                        }
                    }
                }
            }
        }
    }

    private boolean dfs(
        int startRow,
        int startCol,
        char[][] board,
        List<int[]> region
    ) {

        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        boolean touchesEdge = false;

        int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };

        while (!stack.isEmpty()) {

            int[] cell = stack.pop();

            int row = cell[0];
            int col = cell[1];

            region.add(cell);

            if (onEdge(row, col)) {
                touchesEdge = true;
            }

            for (int[] direction : directions) {

                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newRow < ROWS &&
                    newCol >= 0 && newCol < COLS &&
                    board[newRow][newCol] == 'O' &&
                    !visited[newRow][newCol]) {

                    visited[newRow][newCol] = true;
                    stack.push(new int[]{newRow, newCol});
                }
            }
        }

        return !touchesEdge;
    }

    private boolean onEdge(int row, int col) {
        return row == 0 ||
               col == 0 ||
               row == ROWS - 1 ||
               col == COLS - 1;
    }
}

// @lc code=end

