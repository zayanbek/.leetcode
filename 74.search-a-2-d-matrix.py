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
        
        
        w, h = len(matrix[0]), len(matrix)
        
        left, right = 0, w * h - 1
        
        while left <= right:
            
            mid = (left + right) // 2
                        
            val = matrix[int(float(mid)/w)][mid % w]  
            
            if val == target:
                return True
            
            elif val < target:
                left = mid + 1
            
            elif val > target:
                right = mid - 1
            
        return False
                 
# @lc code=end

