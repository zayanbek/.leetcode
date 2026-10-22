/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";

        while (columnNumber > 0) {
            columnNumber--;
            int offset = columnNumber % 26;
            res = ((char) ('A' + offset)) + res;
            columnNumber /= 26;
        }
        return res;
    }
}
// @lc code=end

