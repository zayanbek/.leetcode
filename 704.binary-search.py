#
# @lc app=leetcode id=704 lang=python
#
# [704] Binary Search
#


# @lc code=start
class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """

        l = 0
        r = len(nums) - 1
        
        while l<=r:
            mid = (l+r)//2
            
            if nums[mid] == target:
                return mid
            
            if nums[mid] < target:
                l = mid + 1
            else:
                r = mid - 1
                
        return -1
        
        
# @lc code=end

