/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int n = s1.length(), k = s2.length();

        HashMap<Character, Integer> map = new HashMap<>(); 
        
        for(char c : s1.toCharArray()) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int val = map.get(c);
                map.replace(c, val + 1);
            }
        }

        for(int left = 0; left <= (k-n); left++) {
            HashMap<Character, Integer> temp = new HashMap<>(map);

            int i = left;
            while (i < left + n) {
                char c = s2.charAt(i);

                if (!temp.containsKey(c))
                    break;

                temp.put(c, temp.get(c) - 1);

                if (temp.get(c) == 0)
                    temp.remove(c);

                i++;
            }

            if (temp.isEmpty())
                return true;
        }

        return false;
    }
}
// @lc code=end

