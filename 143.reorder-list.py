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
    
    def reorder(self, head, length):
        if length == 0:
            return None

        if length == 1:
            tail = head.next
            head.next = None
            return tail

        if length == 2:
            tail = head.next.next
            head.next.next = None
            return tail

        # recurse on the middle portion
        tail = self.reorder(head.next, length - 2)

        sub_head = head.next
        next_tail = tail.next

        head.next = tail
        tail.next = sub_head

        return next_tail
    
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        
        node = head
        count = 0
        while node:
            count += 1
            node = node.next
        
        self.reorder(head, count)
        
# @lc code=end

