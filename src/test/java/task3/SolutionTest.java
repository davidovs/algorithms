package task3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void runMerge() {
        assertEquals(solution.get(getListNode1(), getListNode2()), "1->1->2->3->4->4");
    }

    private ListNode getListNode1() {
        ListNode listNode11 = new ListNode(1);

        ListNode listNode12 = new ListNode(2);
        listNode11.next = listNode12;

        ListNode listNode13 = new ListNode(4);
        listNode12.next = listNode13;

        return listNode11;
    }

    private ListNode getListNode2() {
        ListNode listNode21 = new ListNode(1);

        ListNode listNode22 = new ListNode(3);
        listNode21.next = listNode22;

        ListNode listNode23 = new ListNode(4);
        listNode22.next = listNode23;

        return listNode21;
    }
}