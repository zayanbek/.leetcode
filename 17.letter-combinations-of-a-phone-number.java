/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution {

    char[][] numPad = new char[][] 
    {
        {},                     // 0
        {},                     // 1
        {'a', 'b', 'c'},        // 2
        {'d', 'e', 'f'},        // 3
        {'g', 'h', 'i'},        // 4
        {'j', 'k', 'l'},        // 5
        {'m', 'n', 'o'},        // 6
        {'p', 'q', 'r', 's'},   // 7
        {'t', 'u', 'v'},        // 8
        {'w', 'x', 'y', 'z'}    // 9
    };

    List<String> result = new ArrayList<>();
    String digits;

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0 || digits == null) return new ArrayList<>();

        this.digits = digits;
        dfs("", 0);
        return result;
    }

    public void dfs(String path, int i ) {
        if (path.length() == digits.length()) {
            result.add(path);
            return;
        }

        int currentDigit = Character.getNumericValue(digits.charAt(i));

        for (char letter : numPad[currentDigit]) {
            path += letter;
            dfs(path, i + 1);
            path = path.substring(0, path.length() - 1);
        }

        return;
    }

}
// @lc code=end

