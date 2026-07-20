#
# @lc app=leetcode id=2 lang=python
#
# [2] Add Two Numbers
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: Optional[ListNode]
        :type l2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        
        sum = 0
        
        multiplier = 1
        
        while l1:
            sum += (l1.val * multiplier)
            multiplier *= 10
            l1 = l1.next
        
        multiplier = 1
        while l2:
            sum += (l2.val * multiplier)
            multiplier *= 10
            l2 = l2.next
            
        s = str(sum)[::-1]
        
        curr = head = ListNode(int(s[0]))

        for char in s[1:]:
            curr.next = ListNode(int(char))
            curr = curr.next
            
        return head
            
        
# @lc code=end

