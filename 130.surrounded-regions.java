/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

// @lc code=start
class Solution {

    int ROWS, COLS;

    public void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;

        // top and bottom
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O') {
                dfs(0, i, board);
            }
            if (board[ROWS - 1][i] == 'O') {
                dfs(ROWS - 1, i, board);
            }
        } 
        
        // left and right
        for (int j = 0; j < board.length; j++) {
            if (board[j][0] == 'O') {
                dfs(j, 0, board);
            }

            if (board[j][COLS - 1] == 'O') {
                dfs(j, COLS - 1, board);
            }
        }

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                } else if (board[row][col] == 'E') {
                    board[row][col] = 'O';
                }
            }
        }

    }

    private void dfs(int row, int col, char[][] board) {

        if (row < 0 ||
            col < 0 ||
            row >= ROWS ||
            col >= COLS ||
            board[row][col] != 'O'
        ) {
            return;
        }

        board[row][col] = 'E';

        dfs(row + 1, col, board);
        dfs(row - 1, col, board);
        dfs(row, col + 1, board);
        dfs(row, col - 1, board);

    }


}

// @lc code=end

