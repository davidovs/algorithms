package common;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int value) {
        val = value;
    }

    public String toString() {
        String result = "";

        ListNode listNode = this;

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