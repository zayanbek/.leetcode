#
# @lc app=leetcode id=143 lang=python
#
# [143] Reorder List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        
        ptr = head
        length = 0
        while ptr:
            ptr.next
            length += 1
            
        dummy = curr = head
        
        next = head.next
        
        for i in range(1):
            count = 0
            ptr = curr
            for i in range(length - count - 1):
                ptr = ptr.next
                
            curr.next = ptr
            ptr.next = next
            curr = next
            
        return dummy


# [2,4,6,8,10]
        
# @lc code=end

