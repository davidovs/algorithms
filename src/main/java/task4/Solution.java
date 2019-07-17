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
    class ListNode {
        int val;
        ListNode next;
        ListNode(int value) { val = value; }
    }

    private ListNode mergeMulitple(ListNode[] nodes) {

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

    public void runMergeMulitple() {
        ListNode listNode11 = new ListNode(1);

        ListNode listNode12 = new ListNode(2);
        listNode11.next = listNode12;

        ListNode listNode13 = new ListNode(4);
        listNode12.next = listNode13;


        ListNode listNode21 = new ListNode(1);

        ListNode listNode22 = new ListNode(3);
        listNode21.next = listNode22;

        ListNode listNode23 = new ListNode(4);
        listNode22.next = listNode23;


        ListNode listNode31 = new ListNode(0);

        ListNode listNode32 = new ListNode(1);
        listNode31.next = listNode32;

        ListNode listNode33 = new ListNode(2);
        listNode32.next = listNode33;

        ListNode listNode34 = new ListNode(3);
        listNode33.next = listNode34;

        ListNode listNode35 = new ListNode(4);
        listNode34.next = listNode35;

        ListNode listNode36 = new ListNode(5);
        listNode35.next = listNode36;

        ListNode[] listNodeArray = {listNode11, listNode21, listNode31};

        printList(mergeMulitple(listNodeArray));
    }

    private void printList(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val);
            if (listNode.next != null) {
                System.out.print("->");
            }
            listNode = listNode.next;
        }
    }
}