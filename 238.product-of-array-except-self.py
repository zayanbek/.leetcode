#
# @lc app=leetcode id=238 lang=python
#
# [238] Product of Array Except Self
#

# @lc code=start
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        left = [1] * len(nums)
        right = [1] * len(nums)
            
        for i in range(1, len(nums)):
            if(i == 1):
                left[i] = nums[i-1]
                right[len(nums)-i-1] = nums[len(nums)-i]
            else:
                left[i] = left[i-1] * nums[i-1]
                right[len(nums)-i-1] = right[len(nums)-i] * nums[len(nums)-i]
            
        result = []
            
        for i in range(len(nums)):
            result.append(left[i] * right[i])
        
        return result
        
        
# @lc code=end

