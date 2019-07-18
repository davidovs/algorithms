package task4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void test1() {
        assertEquals(solution.execute(getListNodeArray()), "0->1->1->1->2->2->3->3->4->4->4->5");
    }

    private ListNode[] getListNodeArray() {

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

        return new ListNode[]{listNode11, listNode21, listNode31};
    }
}