#
# @lc app=leetcode id=217 lang=python
#
# [217] Contains Duplicate
#

# @lc code=start
from collections import Counter


class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        map = Counter(nums)
        
        for n in map.values():
            if n>=2:
                return True
            
        return False
        
# @lc code=end

