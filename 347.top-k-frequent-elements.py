#
# @lc app=leetcode id=347 lang=python
#
# [347] Top K Frequent Elements
#

# @lc code=start
class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        
        frequencies = {}
        for num in nums:
            if num in frequencies:
                frequencies[num] += 1
            else:
                frequencies[num] = 1
                
        sorted_frequencies = sorted(frequencies.items(), key=lambda x: x[1], reverse=True)
        return [item[0] for item in sorted_frequencies[:k]]
        
# @lc code=end

