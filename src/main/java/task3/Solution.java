package task3;

/**
 * Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * Definition for singly-linked list.
 */

import common.ListNode;

import java.util.Scanner;

public class Solution {

    public String execute(ListNode node1, ListNode node2) {
        // TODO check for null
        return merge(node1, node2).toString();
    }

    private ListNode merge(ListNode node1, ListNode node2) {
        ListNode head = new ListNode(0);

        ListNode prevNode = head;

        // TODO optimize for the case lists not intersect

        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                prevNode.next = new ListNode(node1.val);
                node1 = node1.next;
            } else {
                prevNode.next = new ListNode(node2.val);
                node2 = node2.next;
            }
            prevNode = prevNode.next;
        }

        if (node1 != null) {
            prevNode.next = node1;
        } else {
            prevNode.next = node2;
        }

        return head.next;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO
        Solution solution = new Solution();
//        solution.execute()
        // TODO
    }
}