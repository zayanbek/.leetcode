#
# @lc app=leetcode id=11 lang=python
#
# [11] Container With Most Water
#

# @lc code=start
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        
        max_area = 0
        
        for i in range(len(height)):
            for j in range(i + 1, len(height)):
                
                area = min(height[i], height[j]) * (j - i)
                max_area = max(max_area, area)
        
        return max_area
    
# @lc code=end

