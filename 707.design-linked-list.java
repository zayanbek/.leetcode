/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 */

// @lc code=start


class MyLinkedList {

    private class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = new Node(0); // Permanent dummy node
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node newNode = new Node(val, prev.next);
        prev.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        Node prev = head;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

// @lc code=end

