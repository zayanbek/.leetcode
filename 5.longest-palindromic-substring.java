/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int resultLength = 0, resultIndex = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // odd length
            int l = i;
            int r = i;
            while (inBounds(n,l,r) && leftAndRightMatch(s,l,r)) {
                if (r - l + 1 > resultLength) {
                    resultIndex = l;
                    resultLength = r - l + 1;
                }
                l--;
                r++;
            }

            // even length
            l = i;
            r = i + 1;
            while (inBounds(n,l,r) && leftAndRightMatch(s,l,r)) {
                if (r - l + 1 > resultLength) {
                    resultIndex = l;
                    resultLength = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(
            resultIndex, resultIndex + resultLength
        );
        
    }
    private boolean inBounds(int n, int l, int r) {
        return l >= 0 && r < n;
    }

    private boolean leftAndRightMatch(String s, int l, int r) {
        return s.charAt(l) == s.charAt(r);
    }
}

// @lc code=end

