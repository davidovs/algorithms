package task4;

import java.util.HashSet;
import java.util.Set;

/*
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
        return listNodeToString(mergeMulitpleListNode(nodes));
    }

    private ListNode mergeMulitpleListNode(ListNode[] nodes) {

        ListNode head = new ListNode(0);
        ListNode prevNode = head;

        Set<ListNode> nodesSet = new HashSet<ListNode>();
        for (ListNode node : nodes) {
            nodesSet.add(node);
        }

        int min;
        ListNode minNode;

        while (!nodesSet.isEmpty()) {
            min = Integer.MAX_VALUE;
            minNode = null;

            for (ListNode node : nodesSet) {
                if (node.val <= min) {
                    min = node.val;
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

    private String listNodeToString(ListNode listNode) {
        String result = "";

        while (listNode != null) {
            result += listNode.val;
            if (listNode.next != null) {
                result += "->";
            }
            listNode = listNode.next;
        }

        return result;
    }
}