/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    String word;
    int len;
    char[][] board;
    boolean[][] path;

    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.len = word.length();
        this.board = board;
        this.path = new boolean[board.length][board[0].length];

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(r, c, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(int r, int c, int i) {

        // base case
        if (i == len) {
            return true;
        }

        // invalid
        if (r < 0 || c < 0 ||
            r >= board.length || c >= board[0].length ||
            board[r][c] != word.charAt(i) ||
            path[r][c]) {
            return false;
        }

        // choose
        path[r][c] = true;

        boolean res = dfs(r + 1, c, i + 1) ||
                      dfs(r - 1, c, i + 1) ||
                      dfs(r, c + 1, i + 1) ||
                      dfs(r, c - 1, i + 1);

        // undo
        path[r][c] = false;

        return res;
    }
}
// @lc code=end

