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
        map = set()
        for n in nums:
            if n in map:
                return True
            else:
                map.add(n)
        
        return false
        
# @lc code=end

