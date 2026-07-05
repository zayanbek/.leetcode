#
# @lc app=leetcode id=20 lang=python
#
# [20] Valid Parentheses
#

# @lc code=start
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """

        stack = []        
        
        for char in s:
            if char in ['(','{','[']:
                stack.append(char)
                
            else:
                
                top = stack[-1]
                top_matches = (
                    (char is ')' and top is '(') or
                    (char is '}' and top is '{') or
                    (char is ']' and top is '[')
                )
                
                if top_matches:
                    stack.pop()
                else:
                    return False

        if not stack:
            return 
        
        return False
# @lc code=end

