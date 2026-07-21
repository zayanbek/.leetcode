#
# @lc app=leetcode id=19 lang=python
#
# [19] Remove Nth Node From End of List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        
        len = 0
        curr = head
        while curr:
            len += 1
            curr = curr.next
            
        index = len - n
        
        curr = head
        
        if index == 0:
            return curr.next
        
        for i in range(len - 1):
            if(i + 1) == index:
                curr.next = curr.next.next
                break
            curr = curr.next
        
        return head         
        
# @lc code=end

