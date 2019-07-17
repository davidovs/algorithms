package task3;

/*
 * Merge Two Sorted Lists
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * Definition for singly-linked list.
 */

public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int value) { val = value; }
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

    public void runMerge() {
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

        printList(merge(listNode11, listNode21));
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