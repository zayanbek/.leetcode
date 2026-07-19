#
# @lc app=leetcode id=74 lang=python
#
# [74] Search a 2D Matrix
#

# @lc code=start
class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        
        
        width = len(matrix[0])
        height = len(matrix)
        
        pos = lambda row, col: row * width + col
        index = lambda pos: (int(floor(pos)/width), pos % width)
        
        left = pos(0, 0) # = 0
        right = pos(height - 1, width - 1)
        
        while left <= right:
            
            mid = (left + right) // 2
            
            i = index(mid)
            val = matrix[i[0]][i[1]]
            
            if val == target:
                return True
            
            elif val < target:
                left = mid + 1
            
            elif val > target:
                right = mid - 1
            
        return False
            
             
# @lc code=end

