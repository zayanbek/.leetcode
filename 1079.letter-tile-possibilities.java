/*
 * @lc app=leetcode id=1079 lang=java
 *
 * [1079] Letter Tile Possibilities
 */

// @lc code=start

import java.util.HashMap;

class Solution {

    HashMap<Character, Integer> map = new HashMap<>();
    int count = 0;

    public int numTilePossibilities(String tiles) {
        for (char c : tiles.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        dfs("");

        return count;
    
    }
    private void dfs(String path) {
        // a sort of base case
        if (path.length() > 0) count++;

        for (char c : map.keySet()) {
            int frequency = map.get(c);
            
            if (frequency > 0) {
                // do
                map.put(c, frequency - 1);
                dfs(path + c);
                // undo
                map.put(c, frequency);
            }
        }
    }
}
// @lc code=end

