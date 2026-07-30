/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start

import java.util.Stack;
import java.util.ArrayList;

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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<>();
        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            stack.push(curr);

            if (stack.size() == k) {
                for (int i = 0; i < k; i++) {
                    arr.add(stack.pop());
                }
            }

            if (curr.next == null) {
                while (!stack.isEmpty()) {
                    arr.add(stack.remove(0)); // preserves leftover order
                }
            }

            curr = curr.next;
        }

        for (int i = 0; i < arr.size() - 1; i++) {
            arr.get(i).next = arr.get(i + 1);
        }

        arr.get(arr.size() - 1).next = null;

        return arr.get(0);
    }
}

// @lc code=end

