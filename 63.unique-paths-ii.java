/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        
        int m = obstacleGrid.length; // rows
        int n = obstacleGrid[0].length; // cols

        // prechecks
        if (obstacleGrid[0][0] == 1 ||
            obstacleGrid[m - 1][n - 1] == 1
        ) {
            return 0;
        }

        // top
        boolean broken = false;
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                obstacleGrid[0][i] = -1;
                broken = true;
            } else if (!broken) {
                obstacleGrid[0][i] = 1;
            }
        }
        // left
        broken = false;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                obstacleGrid[i][0] = -1;
                broken = true;
            } else if (!broken) {
                obstacleGrid[i][0] = 1;
            }
        }
        // remaining
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (obstacleGrid[r][c] == 1) {
                    obstacleGrid[r][c] = -1;
                } else {
                    int sum = 0;
                    if (obstacleGrid[r - 1][c] != -1) {
                        sum += obstacleGrid[r - 1][c];
                    }
                    if (obstacleGrid[r][c - 1] != -1) {
                        sum += obstacleGrid[r][c - 1];
                    }
                    obstacleGrid[r][c] = sum;
                }
            }
        }
        
        // print 2d array
        // for (int[] row : obstacleGrid) {
        //     for (int element : row) {
        //         System.out.print(element + " ");
        //     }
        //     System.out.println();
        // }
        

        return obstacleGrid[m - 1][n - 1];
    }
}
// @lc code=end

