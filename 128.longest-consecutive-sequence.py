#
# @lc app=leetcode id=128 lang=python
#
# [128] Longest Consecutive Sequence
#

# @lc code=start
class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        map = set(nums)
        max_length = 0
            
        for num in map:
            if (num - 1) not in map:
                length = 1
                while (num + length) in map:
                    length += 1
                
                max_length = max(max_length, length)
        
        return max_length
        
# @lc code=end

