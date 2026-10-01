/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;

        List<Integer> values = new ArrayList<>();
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        int n = values.size();
        for (int i = 0; i < n / 2; i++) {
            if (values.get(i) != values.get(n - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

// @lc code=end

