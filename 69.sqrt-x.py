#
# @lc app=leetcode id=69 lang=python
#
# [69] Sqrt(x)
#

# @lc code=start
class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        
        l = 1
        r = x
        res = 0
        
        while l <= r:
            mid = (l+r)//2
            sq = mid * mid
            
            if sq > x:
                r = mid - 1
            elif sq < x:
                l = mid + 1
                res = mid
            else:
                return mid
                
        return res
    

# @lc code=end

