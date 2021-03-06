package task4;

import common.ListNode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Merge Many Sorted Lists
 *
 * Merge many sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * Input: 1->2->4, 1->3->4, 0->1->2->3->4->5
 * Output: 0->1->1->1->2->2->3->3->4->4->4->5
 * Definition for singly-linked list.
 */

public class Solution {

    public String execute(ListNode[] nodes) {
        // TODO check for null
        return mergeMulitpleListNode(nodes).toString();
    }

    private ListNode mergeMulitpleListNode(ListNode[] nodes) {

        ListNode head = new ListNode(0);
        ListNode prevNode = head;

        Set<ListNode> nodesSet = new HashSet<ListNode>();
        for (ListNode node : nodes) {
            nodesSet.add(node);
        }

        int minVal;
        ListNode minNode;

        while (!nodesSet.isEmpty()) {
            minVal = Integer.MAX_VALUE;
            minNode = null;

            for (ListNode node : nodesSet) {
                if (node.val < minVal) {
                    minVal = node.val;
                    minNode = node;
                }
            }

            prevNode.next = new ListNode(minNode.val);

            nodesSet.remove(minNode);

            if (minNode.next != null) {
                minNode = minNode.next;
                nodesSet.add(minNode);
            }

            prevNode = prevNode.next;
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